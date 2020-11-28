package com.xinnuna.uiwidgettest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button_login);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.xinnuna.uiwidgettest.ACTION_START");
                startActivity(intent);
            }
        });
        ImageButton button2 = (ImageButton) findViewById(R.id.image_QQ);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "使用QQ账号登录", Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton button3 = (ImageButton) findViewById(R.id.image_WeChat);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "使用微信账号登录", Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton button4 = (ImageButton) findViewById(R.id.image_Sina);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "使用新浪账号登录", Toast.LENGTH_SHORT).show();
            }
        });
        Button button5 = (Button) findViewById(R.id.sign);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignActivity.class);
                startActivity(intent);
            }
        });
        Button button6 = (Button) findViewById(R.id.help);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "有问题自己解决！", Toast.LENGTH_SHORT).show();
            }
        });
    }
}