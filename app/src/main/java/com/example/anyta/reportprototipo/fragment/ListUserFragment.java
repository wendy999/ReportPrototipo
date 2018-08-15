package com.example.anyta.reportprototipo.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.anyta.reportprototipo.R;
import com.example.anyta.reportprototipo.adapter.AdapterUser;
import com.example.anyta.reportprototipo.pojo.UserVo;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ListUserFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ListUserFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListUserFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    ArrayList<UserVo> listUsers;
    ArrayList<UserVo> listUsersAux;
    RecyclerView recyclerUsers;
    ArrayList <UserVo> ListGrades;
    private AdapterUser adapter;
    //Spinner
    TextView estado;
    Spinner comboGrades;


    public ListUserFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ListUserFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ListUserFragment newInstance(String param1, String param2) {
        ListUserFragment fragment = new ListUserFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View vista = inflater.inflate(R.layout.fragment_list_user, container, false);



        listUsers = new ArrayList<>();
        FillListUsers();
        listUsersAux = new ArrayList<UserVo>(listUsers);

        recyclerUsers = vista.findViewById(R.id.recyclerId);
        recyclerUsers.setLayoutManager(new LinearLayoutManager(getContext()));

        //Spinner
        estado = vista.findViewById(R.id.id_textSpinner);
        comboGrades = vista.findViewById(R.id.spinnner_id);

        final ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(this.getActivity(),R.array.Grades,android.R.layout.simple_spinner_item);
        comboGrades.setAdapter(adapter1);

        this.adapter = new AdapterUser(listUsers);
        recyclerUsers.setAdapter(adapter);

        adapter.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Selecciona:"
                        +listUsers.get(recyclerUsers.getChildAdapterPosition(view)).getName(),Toast.LENGTH_SHORT).show();
            }
        });

        //Onclick

        comboGrades.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(adapterView.getContext(), "Selected: "+adapterView.getItemAtPosition(i).toString(),Toast.LENGTH_LONG).show();

                estado.setText("Selected: "+adapterView.getItemAtPosition(i).toString());

                //
                ListGrades = new ArrayList<>();

                for (UserVo student: listUsersAux)
                {
                    if (adapterView.getItemAtPosition(i).toString().equals(student.getGrade()))
                    {
                        ListGrades.add(student);
                    }
                }

                listUsers.clear();
                listUsers.addAll(ListGrades);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //End Onclick

        //End Spinner

        return vista;
    }

    private void FillListUsers() {

        //Decimo
        listUsers.add(new UserVo("Decimo","Camila Montes","This is a test",R.drawable.android));
        listUsers.add(new UserVo("Decimo","Ronaldo Davila","This is a test",R.drawable.android1));
        listUsers.add(new UserVo("Decimo","Julian Restrepo","This is a test",R.drawable.android2));
        listUsers.add(new UserVo("Decimo","Tatiana Hernandez","This is a test",R.drawable.android3));
        listUsers.add(new UserVo("Decimo","Brandon Steven Nieto","This is a test",R.drawable.android4));
        listUsers.add(new UserVo("Decimo","Wendy Vannesa Mejia","This is a test",R.drawable.android5));


        //Once
        listUsers.add(new UserVo("Once","Camila Montes","This is a test",R.drawable.android));
        listUsers.add(new UserVo("Once","Ronaldo Davila","This is a test",R.drawable.android1));
        listUsers.add(new UserVo("Once","Julian Restrepo","This is a test",R.drawable.android2));
        listUsers.add(new UserVo("Once","Tatiana Hernandez","This is a test",R.drawable.android3));
        listUsers.add(new UserVo("Once","Brandon Steven Nieto","This is a test",R.drawable.android4));
        listUsers.add(new UserVo("Once","Wendy Vannesa Mejia","This is a test",R.drawable.android5));

        //Noveno
        listUsers.add(new UserVo("Noveno","Camila Montes","This is a test",R.drawable.android));
        listUsers.add(new UserVo("Noveno","Ronaldo Davila","This is a test",R.drawable.android1));
        listUsers.add(new UserVo("Noveno","Julian Restrepo","This is a test",R.drawable.android2));
        listUsers.add(new UserVo("Noveno","Tatiana Hernandez","This is a test",R.drawable.android3));
        listUsers.add(new UserVo("Noveno","Brandon Steven Nieto","This is a test",R.drawable.android4));
        listUsers.add(new UserVo("Noveno","Wendy Vannesa Mejia","This is a test",R.drawable.android5));

        //Octavo
        listUsers.add(new UserVo("Octavo","Camila Montes","This is a test",R.drawable.android));
        listUsers.add(new UserVo("Octavo","Ronaldo Davila","This is a test",R.drawable.android1));
        listUsers.add(new UserVo("Octavo","Julian Restrepo","This is a test",R.drawable.android2));
        listUsers.add(new UserVo("Octavo","Tatiana Hernandez","This is a test",R.drawable.android3));
        listUsers.add(new UserVo("Octavo","Brandon Steven Nieto","This is a test",R.drawable.android4));
        listUsers.add(new UserVo("Octavo","Wendy Vannesa Mejia","This is a test",R.drawable.android5));

        //Septimo
        listUsers.add(new UserVo("Septimo","Camila Montes","This is a test",R.drawable.android));
        listUsers.add(new UserVo("Septimo","Ronaldo Davila","This is a test",R.drawable.android1));
        listUsers.add(new UserVo("Septimo","Julian Restrepo","This is a test",R.drawable.android2));
        listUsers.add(new UserVo("Septimo","Tatiana Hernandez","This is a test",R.drawable.android3));
        listUsers.add(new UserVo("Septimo","Brandon Steven Nieto","This is a test",R.drawable.android4));
        listUsers.add(new UserVo("Septimo","Wendy Vannesa Mejia","This is a test",R.drawable.android5));

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
