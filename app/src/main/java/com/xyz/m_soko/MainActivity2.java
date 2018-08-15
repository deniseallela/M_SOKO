package com.xyz.m_soko;

import android.content.Intent;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class MainActivity2 extends AppCompatActivity {

    private GestureDetectorCompat movement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//get music placed on the direcory raw
        movement = new GestureDetectorCompat(this, new LearnGesture());
        //LearnGesture is a class file

    }

    public boolean onTouchEvent(MotionEvent event) {
        this.movement.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    class LearnGesture extends GestureDetector.SimpleOnGestureListener {
        //a gesture listener tells which gesture has been made

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            if (e2.getX() > e1.getX()) {
                Intent hh = new Intent(MainActivity2.this, Listview.class);
                startActivity(hh);
            }
            return true;
        }
    }
}
