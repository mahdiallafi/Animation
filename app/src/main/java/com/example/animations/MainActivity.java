package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView image,imag1;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
AnimationDrawable wifi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image=findViewById(R.id.image);
        image.setBackgroundResource(R.drawable.animation);
        wifi=(AnimationDrawable)image.getBackground();

    ///////here the animation
        imag1=findViewById(R.id.imageView);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        b7=findViewById(R.id.button7);
        b8=findViewById(R.id.button8);
        b9=findViewById(R.id.button9);
        /***Zoom in animation */
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imag1.startAnimation(AnimationUtils.loadAnimation
                        (getApplicationContext(),R.anim.zoom_in));

            }
        });
        /***ZOOMOUT*/
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imag1.startAnimation(AnimationUtils.
                        loadAnimation(getApplicationContext(),R.anim.zoom_out));

            }
        });
        /**FADEIN*/
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imag1.startAnimation(AnimationUtils.
                        loadAnimation(getApplicationContext(),R.anim.fade_in));

            }
        });
        /**FADEOUT*/
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imag1.startAnimation(AnimationUtils.
                        loadAnimation(getApplicationContext(),R.anim.fade_out));

            }
        });
        /**SLIDE LEFT*/
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imag1.startAnimation(AnimationUtils.
                        loadAnimation(getApplicationContext(),R.anim.slide_left));

            }
        });
        /**SLIDE RIGHT*/
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imag1.startAnimation(AnimationUtils.
                        loadAnimation(getApplicationContext(),R.anim.slide_right));

            }
        });
        /**ROTATE*/
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imag1.startAnimation(AnimationUtils.
                        loadAnimation(getApplicationContext(),R.anim.rotate));

            }
        });
        /**MOVE*/
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imag1.startAnimation(AnimationUtils.
                        loadAnimation(getApplicationContext(),R.anim.move));

            }
        });
        /**FADEIN+ZOOMIN*/
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imag1.startAnimation(AnimationUtils.
                        loadAnimation(getApplicationContext(),R.anim.fadein_zoomin));

            }
        });
        Button BUTTON10=(Button)findViewById(R.id.button10);
        BUTTON10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,FlipCard.class);
                startActivity(intent);

            }
        });
    }

    ///display the animation when window open


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        wifi.start();
    }
}
