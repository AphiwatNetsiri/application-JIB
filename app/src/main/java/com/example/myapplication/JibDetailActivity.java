package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class JibDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jib_detail);

        Intent intent = getIntent();
        String jibName = intent.getStringExtra("jibName");
        String jibModel = intent.getStringExtra("jibModel");
        String jibPrice = intent.getStringExtra("jibPrice");
        String jibImg = intent.getStringExtra("jibImg");

        ImageView imageView = findViewById(R.id.new2);
        Glide.with(this)
                .load(jibImg)
                .into(imageView);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Name: " + jibName + "\nModel: " + jibModel + "\nPrice: " + jibPrice);
    }
}
