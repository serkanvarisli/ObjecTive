package com.example.DetecTive;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import org.opencv.android.OpenCVLoader;

import DecevTive.R;

public class Giris extends AppCompatActivity {
    Button kamera, galeri;

    static {
        if(OpenCVLoader.initDebug()){
            Log.d("MainActivity: ","Opencv is loaded");
        }
        else {
            Log.d("MainActivity: ","Opencv failed to load");
        }
    }
    //Serkan VARIŞLI
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        galeri=findViewById(R.id.galeri);
        kamera=findViewById(R.id.kamera);

        galeri.setOnClickListener(v->{
             Intent intent=new Intent(getApplicationContext(), galeri.class);
            startActivity(intent);
        });
        kamera.setOnClickListener(v->{
            Intent intent2=new Intent(getApplicationContext(), CameraActivity.class);
            startActivity(intent2);
        });
    }
}