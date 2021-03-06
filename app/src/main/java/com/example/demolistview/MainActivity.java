package com.example.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.list_view);

        ArrayList<String> myArrayList = new ArrayList<String>();

        myArrayList.add("Rafael jr.");
        myArrayList.add("Cielo");
        myArrayList.add("Mirthala");
        myArrayList.add("Rafael");
        myArrayList.add("Karen");
        myArrayList.add("Daysi");

        ArrayAdapter<String> myArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myArrayList);

        myListView.setAdapter(myArrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Persona Seleccionada: " + myArrayList.get(i),Toast.LENGTH_SHORT).show();
            }
        });
    }

}