package com.xinnuna.uiwidgettest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        Button button2=(Button)findViewById(R.id.button_baidu);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://wappass.baidu.com/passport?login&u=https%3A%2F%2Ftiebac.baidu.com%2Findex%2Ftbwise%2Fmine#/insert_account"));
                startActivity(intent);
            }
        });

    }
}