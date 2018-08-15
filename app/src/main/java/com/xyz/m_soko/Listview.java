package com.xyz.m_soko;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Listview extends AppCompatActivity {
    //declare variables to hold the views
    List<com.xyz.m_soko.Custom> listtems;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        //find item based on id
        listView=findViewById(R.id.listview);
        listtems=new ArrayList<>();
        listtems.add(new Custom(R.drawable.lettuce,"Lettuce", "View"));
        listtems.add(new Custom(R.drawable.cucumber,"Cucumber","View"));
        listtems.add(new Custom(R.drawable.carrots,"Carrots","View"));
        listtems.add(new Custom(R.drawable.coriander,"Coriander","View"));
        listtems.add(new Custom(R.drawable.onions,"Onions","View"));
        CustomAdapter adapter=new CustomAdapter(Listview.this,
                R.layout.listviewlayout,listtems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){

                }
                else if(i==1){

                }
                else if(i==2){

                }
                else if(i==3){

                }
            }
        });
    }
}
