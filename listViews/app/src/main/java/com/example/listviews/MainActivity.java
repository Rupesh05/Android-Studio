package com.example.listviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView=findViewById(R.id.myListView);
        ArrayList<String> myfamily=new ArrayList<String>();
        myfamily.add(Rupesh);
        myfamily.add(rajesh);
    }
}
