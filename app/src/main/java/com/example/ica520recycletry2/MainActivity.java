package com.example.ica520recycletry2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private final LinkedList<String> mIntList = new LinkedList<>();

    private RecyclerView mRecyclerView;
    private IntListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //populate the list
        for(int i = 0; i < 20; i++){
            mIntList.addLast(Integer.toString(i));
        }

        //Get a trucker's handle to the RV
        mRecyclerView = findViewById(R.id.recycler);
        //Create an adapter and supply data
        mAdapter = new IntListAdapter(this,mIntList);
        //Connect adapter and RV
        mRecyclerView.setAdapter(mAdapter);
        //Give RV a default layout manager
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
