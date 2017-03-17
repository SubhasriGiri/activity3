package com.example.shank.alumini;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import android.widget.GridView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener,AdapterView.OnItemClickListener {




    GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=(GridView)findViewById(R.id.gridView);

        gridView.setAdapter(new GridAdapter(this));
        gridView.setOnItemClickListener(this);
    }

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent =new Intent(MainActivity.this,alumininames.class);
                startActivity(intent);
            }

    @Override
    public void onClick(View v) {

    }
}


