package com.example.latihanpwpb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button tombolD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tombolD = findViewById(R.id.daftar);
        tombolD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindah();
            }
        });
    }

    protected void pindah(){
        Intent pinda =new Intent(MainActivity.this, DuaKotak.class);
        startActivity(pinda);
    }
}