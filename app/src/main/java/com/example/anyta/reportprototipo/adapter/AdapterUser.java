package com.example.anyta.reportprototipo.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.anyta.reportprototipo.R;
import com.example.anyta.reportprototipo.pojo.UserVo;

import java.util.ArrayList;

public class AdapterUser extends RecyclerView.Adapter<AdapterUser.CharacterViewHolder> implements View.OnClickListener {

    ArrayList<UserVo> ListUsers;
    private View.OnClickListener listener;

    public AdapterUser(ArrayList<UserVo> listUsers) {
        ListUsers = listUsers;
     }

    @NonNull
    @Override
    public CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null,false);
        view.setOnClickListener(this);
        return new CharacterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterViewHolder holder, int position) {
        holder.txtGrade.setText(ListUsers.get(position).getGrade());
        holder.txtName.setText(ListUsers.get(position).getName());
        holder.txtInfo.setText(ListUsers.get(position).getDescription());
        holder.photo.setImageResource(ListUsers.get(position).getImage());


    }


    public class CharacterViewHolder extends RecyclerView.ViewHolder {

        TextView txtGrade,txtName, txtInfo;
        ImageView photo;

        public CharacterViewHolder(View itemView){
            super(itemView);

            txtGrade = itemView.findViewById(R.id.gradeId);
            txtName = itemView.findViewById(R.id.idName);
            txtInfo = itemView.findViewById(R.id.idInfo);
            photo = itemView.findViewById(R.id.imageId);

        }
    }

    @Override
    public int getItemCount() {
        return ListUsers.size();
    }

    //metodos del onclicklistener

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;

    }
    @Override
    public void onClick(View view) {
        if(listener!=null){
            listener.onClick(view);
        }

    }


}
