package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView JIB;
    private Button click;
    private Button resetButton;
    private EditText inputText;
    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JIB = findViewById(R.id.JIB);
        click = findViewById(R.id.click);
        resetButton = findViewById(R.id.resetButton);
        inputText = findViewById(R.id.inputText);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleButtonClick();
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetApp();
            }
        });
    }

    private void handleButtonClick() {
        clickCount++;

        switch (clickCount) {
            case 1:
                JIB.setText("Welcome to JIB");
                break;
            case 2:
                JIB.setText("Enter your Name");
                inputText.setVisibility(View.VISIBLE);
                break;
            case 3:
                String name = inputText.getText().toString();
                JIB.setText(name);
                inputText.setVisibility(View.GONE);
                click.setVisibility(View.GONE);
                resetButton.setVisibility(View.VISIBLE);

                // ส่งข้อมูลไปยัง JibListActivity
                Intent intent = new Intent(MainActivity.this, JibListActivity.class);
                startActivity(intent);
                break;
        }
    }

    private void resetApp() {
        clickCount = 0;
        JIB.setText("JIB");
        inputText.setText("");
        inputText.setVisibility(View.GONE);
        click.setVisibility(View.VISIBLE);
        resetButton.setVisibility(View.GONE);
    }
}
