package com.example.DetecTive;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import DecevTive.R;

public class galeri extends AppCompatActivity {
    Button fotosec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);
        fotosec=findViewById(R.id.fotosec);
        fotosec.setOnClickListener(v->{
            Intent intent = new Intent(Intent.ACTION_PICK,
                    android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI);
            final int ACTIVITY_SELECT_IMAGE = 1234;
            startActivityForResult(intent, ACTIVITY_SELECT_IMAGE);
        });
    }
}