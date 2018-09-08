package com.programming.himel.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView simpleListView;
    ArrayList<String> nameList;
   // String[] listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleListView = findViewById(R.id.simple_listview);
        //listItem = getResources().getStringArray(R.array.array_technology);
        nameList = new ArrayList<>();
        nameList.add("Java");
        nameList.add("C++");
        nameList.add("C");
        nameList.add("Kotlin");



        //simple list
/*        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getApplicationContext()
                ,android.R.layout.simple_list_item_1
                ,nameList);*/

       //row design
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getApplicationContext()
                ,R.layout.row_item_design
                ,R.id.name_text
                ,nameList);




        simpleListView.setAdapter(arrayAdapter);

        simpleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view
                    , int position, long id) {

                String value=arrayAdapter.getItem(position);

                Toast.makeText(MainActivity.this
                        ,"Selected Item : " +nameList.get(position)
                        , Toast.LENGTH_SHORT).show();

            }
        });
    }
}
