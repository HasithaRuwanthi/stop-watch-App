package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

        private int seconds =0;
        private boolean running;
        Animation  rounder;
        ImageView image;
        Button b2;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        image=findViewById(R.id.image2);
        b2=findViewById(R.id.b2);
        // call the image arrow
        rounder= AnimationUtils.loadAnimation(this,R.anim.rounder);
        startTimer();


    }


    public  void onStart(View  view){ //calling start button

            running=true;


    }
    public  void onStop(View  view){//calling  stop button

            running=false;

    }
    public  void onReset(View  view){// calling reset button
            running=false;
            seconds=0;


    }
    private  void startTimer(){  //java code for time
        final TextView timer=findViewById(R.id.timer);
        Handler handler = new Handler();
        handler.post((new Runnable() {
            @Override
            public void run() {
                int hrs= seconds/3600;
                int mint=(seconds%3600)/60;
                int sec=seconds%60;
                String time=String.format("%02d:%02d:%02d",hrs,mint,sec);
                timer.setText(time);
                if(running) {
                    seconds++;
                }
                handler.postDelayed(this,0);
            }
        }));



    }
}
