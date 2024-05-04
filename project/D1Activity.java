package com.cookandroid.project;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class D1Activity extends AppCompatActivity {
    Button button2;
    ImageButton imgButton4;
    ImageButton imageButton5;
    ImageButton imageButton6;

    ImageButton imageButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d1);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DictionaryActivity.class);
                startActivity(intent); // 뒤로 돌아가는 버튼 
            }
        });

        ImageButton imgButton4 = (ImageButton) findViewById(R.id.imgButton4);
        imgButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), D1AActivity.class);
                startActivity(intent); // 원인 버튼을 눌렀을 때 화면전환
            }
        });
        ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), D1BActivity.class);
                startActivity(intent); //증상 버튼을 눌렀을 때 화면 전환환
            }
        });
        ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), D1CActivity.class);
                startActivity(intent); // 치료법 버튼을 눌렀을 때 화면 전환
            }
        });

        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), D11Activity.class);
                startActivity(intent); //돋보기 버튼을 눌렀을 때 화면전환환
            }
        });

    }
}
