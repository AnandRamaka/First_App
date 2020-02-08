package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Dictionary;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button submitButton;
    Button numButton;
    EditText responseText;
    TextView displayText;
    SeekBar topbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton=findViewById(R.id.clickButton);
        topbar=findViewById(R.id.seekBar);
        responseText=findViewById(R.id.responseEditText);
        numButton = findViewById(R.id.numButton);
        displayText=findViewById(R.id.textBox);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Button Clicked");
                Log.i("testButton","Typed text: " + responseText.getText());
                displayText.setText(displayText.getText()+" "+responseText.getText());
            }
        });
    }
    public void setActivityBackgroundColor(int color) {
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }
    public void changeColor(View view) {
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        view.setBackgroundColor(color);
    }
    int num = 0;
    public void incNum(View view) {
        num++;
        numButton.setText(""+num);
    }
}
