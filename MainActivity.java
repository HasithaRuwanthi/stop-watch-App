package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import java.lang.annotation.Annotation;

public class MainActivity extends AppCompatActivity {
    Button button; //create button object
    ImageView image1; //create image veiw object
    Animation animation11; //create animation object
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //load the activity main xml file
        button = findViewById(R.id.b1);// b1 id Button assign to  the button object
        // Assign the b1 Button as button
        
        image1 =findViewById(R.id.image1);//Assign the image as image1
        animation11 = AnimationUtils.loadAnimation(this,R.anim.animation11);// Load the animation

        // passing animation

        image1.startAnimation(animation11); // passing animation
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a= new Intent(MainActivity.this,MainActivity3.class);
                startActivity(a); //crate intent to access another activity
            }
        });



    }
}