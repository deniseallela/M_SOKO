package com.xyz.m_soko;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;

public class MainActivity2 extends AppCompatActivity {
        ImageView img1,img2,img3,img4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);//get music placed on the direcory raw
            img1 = findViewById(R.id.imageView);
            img2 = findViewById(R.id.imageViewfb);
            img3 = findViewById(R.id.imageViewig);
            img4 = findViewById(R.id.imageViewtweet);
        Bitmap image1 =((BitmapDrawable)img1.getDrawable()).getBitmap();

        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();

        image1.compress(Bitmap.CompressFormat.JPEG,50/100,byteArrayOutputStream);


        Bitmap image2 =((BitmapDrawable)img2.getDrawable()).getBitmap();

        ByteArrayOutputStream byteArrayOutputStream2=new ByteArrayOutputStream();

        image2.compress(Bitmap.CompressFormat.JPEG,50/100,byteArrayOutputStream2);

        Bitmap image3 =((BitmapDrawable)img3.getDrawable()).getBitmap();

        ByteArrayOutputStream byteArrayOutputStream3=new ByteArrayOutputStream();

        image3.compress(Bitmap.CompressFormat.JPEG,50/100,byteArrayOutputStream3);

        Bitmap image4 =((BitmapDrawable)img4.getDrawable()).getBitmap();

        ByteArrayOutputStream byteArrayOutputStream4=new ByteArrayOutputStream();

        image4.compress(Bitmap.CompressFormat.JPEG,50/100,byteArrayOutputStream4);
    }
    }

