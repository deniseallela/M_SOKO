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
        EditText name=view.findViewById(R.id.editText4);

        ImageView pic=view.findViewById(R.id.imageView3);

        Custom custom=listtems.get(position);
        name.setText(custom.getNames());
       // pic.setImageDrawable(context.getResources()
               // .getDrawable(custom.getImages()));
        //set onclick listener for button delete
        view.findViewById(R.id.button).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        removeItem(position);
                    }
                }
        );
        return view;
    }

    private void removeItem( final int position) {
        AlertDialog.Builder builder=new AlertDialog.Builder(context);
        builder.setTitle("Wait you deleting me?mmmh...");
        builder.setPositiveButton("YES I AM",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        listtems.remove(position);
                        notifyDataSetChanged();
                    }
                });
        builder.setNegativeButton("NO WAY",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(context, "Not deleted", Toast.LENGTH_SHORT).show();
                    }
                });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }
}

