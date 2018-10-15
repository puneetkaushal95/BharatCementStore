package com.example.guestaccount.building_material_business;

import android.content.Intent;
import android.media.Image;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Toast;



public class Material_one_info extends AppCompatActivity implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener {

    private GestureDetectorCompat gestureDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_one_info);
        this.gestureDetector = new GestureDetectorCompat(this,this);

        Image

        Intent intent1 = getIntent();
        Boolean Show_Image = intent1.getBooleanExtra("Show_Image", false);
        Boolean Show_Desription = intent1.getBooleanExtra("Show_Desription",false);
        if (Show_Image){

        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }


    private final int SWIPE_MIN_DISTANCE = 20;


    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            if (e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE) {
                // Right to left, your code here
                Toast.makeText(Material_one_info.this, "Right to left", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Material_one_info.this,MaterialTwoInfoActivity.class);
                startActivity(intent);
                return true;

            } else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE) {
                // Left to right, your code here
                Toast.makeText(Material_one_info.this,"This is first activity",Toast.LENGTH_SHORT).show();
                return true;
            }
            else if (e2.getY() - e1.getY() > SWIPE_MIN_DISTANCE) {
                // Top to bottom, your code here
                Toast.makeText(Material_one_info.this,"Home Button",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Material_one_info.this,MainActivity.class);
                startActivity(intent);
                return true;
            }

            return true;

        }

        @Override
        public boolean onDoubleTapEvent(MotionEvent e) {
            return false;
        }

        @Override
        public boolean onDown(MotionEvent e) {
            return false;
        }


    }

