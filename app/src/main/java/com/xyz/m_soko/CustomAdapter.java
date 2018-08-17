package com.xyz.m_soko;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Custom> {
    Context context;
    int resource;
    List<com.xyz.m_soko.Custom> listtems;

    public CustomAdapter(@NonNull Context context,
                         int resource,List<Custom> listtems) {
        super(context, resource, listtems);
        this.context = context;
        this.resource = resource;
        this.listtems = listtems;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(context);
        //inflate the deedee layout that was added as a resource
        View view=inflater.inflate(R.layout.listviewlayout,null);
        //find items based on id
        TextView name=view.findViewById(R.id.tvName);


        ImageView pic=view.findViewById(R.id.imgPost);

        Custom custom=listtems.get(position);
        name.setText(custom.getNames());
       pic.setImageDrawable(context.getResources()
               .getDrawable(custom.getImages()));
        return view;
    }

}

