package com.example.huynh.leak;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by huynh on 15-Jul-16.
 */
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context mContext;
    private List<PersonInfo> listEmployee;

    public MyAdapter(List<PersonInfo> listEmployee, Context context) {
        super();
        this.listEmployee = listEmployee;
        mContext = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.custom_item,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.getImageView().setImageResource(listEmployee.get(position).getIdImage());
        holder.getNameTextView().setText("Name: " + listEmployee.get(position).getName());
        holder.getBtnShow().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(mContext).create(); //Read Update
                alertDialog.setTitle("information");
                alertDialog.setMessage("Name: " + listEmployee.get(position).getName() + "\n"+
                        "Age: " + listEmployee.get(position).getAge()
                );

                alertDialog.show();
            }

        });

        holder.getBtnDel().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<PersonInfo> a;
                a = ListActivity.getListEmployee();
                ListActivity.setListEmployee(a,listEmployee.get(position));
                notifyItemRemoved(position);

            }
        });
    }

    @Override
    public int getItemCount() {
        return listEmployee.size();
    }
}
