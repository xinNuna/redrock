package com.xinnuna.uiwidgettest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login2_layout);
        EditText editText = (EditText) findViewById(R.id.password);
        editText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        Intent intent = getIntent();
        String count = intent.getStringExtra("count");
        EditText editText1 = (EditText) findViewById(R.id.edit_text2);
        editText1.setText(count.toCharArray(), 0, count.length());
        Button button1 = (Button) findViewById(R.id.login2_login2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity2.this, MainActivity.class);
                startActivity(intent);

            }
        });
        Button button2 = (Button) findViewById(R.id.button_login);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity2.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}