package com.example.customgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class myAdapter extends ArrayAdapter<Contact_Model> {
     Context context;
     ArrayList<Contact_Model> arrayList;
     public myAdapter(Context context,ArrayList<Contact_Model> arrayList){
         super(context,R.layout.grid_view_layout,arrayList);
         this.context=context;
         this.arrayList=arrayList;
     }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;
        if(convertView==null)
        {
            convertView= LayoutInflater.from(context).inflate(R.layout.grid_view_layout,parent,false);
            holder=new ViewHolder();
            holder.imageView=convertView.findViewById(R.id.img);
            holder.textView=convertView.findViewById(R.id.textView);
            convertView.setTag(holder);
        }
        else
            holder=(ViewHolder) convertView.getTag();
        holder.imageView.setImageResource(arrayList.get(position).img);
        holder.textView.setText(arrayList.get(position).name);
        return convertView;
    }

    static class ViewHolder{
         ImageView imageView;
         TextView textView;
     }
}
