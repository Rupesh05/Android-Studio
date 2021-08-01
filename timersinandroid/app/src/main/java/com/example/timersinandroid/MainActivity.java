package com.example.timersinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setTimer method-1
        /*final Handler handler=new Handler();

         Runnable run=new Runnable() {
             @Override
             public void run() {
                 Log.i("hey its us", "A Second passed Away");

                 handler.postDelayed(this,1000);

             }
         };

         handler.post(run);
         */

        // method -2

        new CountDownTimer(1000,1000) {

            public void onTick(long millisecondsUntilDone) {
                Log.i("Seconds Left", String.valueOf(millisecondsUntilDone / 1000));
            }

            public void onFinish(){
                Log.i("We are done!", "no more countdown");
            }
        }.start();
        }
    }
