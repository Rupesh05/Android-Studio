package com.example.timetables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView timeTableListView;

    public void generateTimeTables(int timeTableNumber){
        ArrayList<String> timesTableContent=new ArrayList<String>();

        for(int j=1;j<=10;j++){
            timesTableContent.add(Integer.toString(j*timeTableNumber));
        }

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 );

        timeTableListView.setAdapter(arrayAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final SeekBar timeTableSeekBar=findViewById(R.id.timeTableSeekBar);
         timeTableListView=findViewById(R.id.timesTableListView);

         int max=20;
         int startingPosition=10;

        timeTableSeekBar.setMax(max);
        timeTableSeekBar.setProgress(startingPosition);

        timeTableSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int min=1;
                int timeTableNumber;
                if(progress<min){
                    timeTableNumber=min;
                    timeTableSeekBar.setProgress(min);
                }
                else{
                    timeTableNumber=progress;
                }
                Log.i("SeekBar value", Integer.toString(timeTableNumber));

                generateTimeTables(timeTableNumber);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
