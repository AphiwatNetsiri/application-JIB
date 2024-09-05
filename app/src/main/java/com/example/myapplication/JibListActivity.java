package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class JibListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jib_list);

        LinearLayout jibItem1 = findViewById(R.id.jibItem1);
        LinearLayout jibItem2 = findViewById(R.id.jibItem2);
        LinearLayout jibItem3 = findViewById(R.id.jibItem3);
        LinearLayout jibItem4 = findViewById(R.id.jibItem4);

        jibItem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showJibDetail("SSD", "Model SSD", "5000", "https://www.3b.co.th/wp-content/uploads/2022/08/Cover-SSD-KIMTIGO-KTA-320-128GB-new.jpg");
            }
        });

        jibItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showJibDetail("GPU RTX", "Model RTX", "25000", "https://dlcdnwebimgs.asus.com/gain/8a418e52-7264-42dd-8fbf-a23c3444a883/w800");
            }
        });

        jibItem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showJibDetail("GPU GTX", "Model GTX", "15000", "https://asset.msi.com/resize/image/global/product/product_10_20191029131030_5db7c9c6b9a7a.png62405b38c58fe0f07fcef2367d8a9ba1/1024.png");
            }
        });

        jibItem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showJibDetail("GPU GTX", "Model PC", "7000", "https://www.jib.co.th/img_master/product/original/2022122909584857077_1.jpg");
            }
        });
    }

    private void showJibDetail(String name, String model, String price, String imgUrl) {
        Intent intent = new Intent(JibListActivity.this, JibDetailActivity.class);
        intent.putExtra("jibName", name);
        intent.putExtra("jibModel", model);
        intent.putExtra("jibPrice", price);
        intent.putExtra("jibImg", imgUrl); // Pass URL instead of resource ID
        startActivity(intent);
    }
}
