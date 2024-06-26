package com.cookandroid.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class D5Activity extends AppCompatActivity {
    Button button2;
    ImageButton imgButton4, imageButton5, imageButton6, imagebutton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d5);

        Button button2 = (Button) findViewById(R.id.button2);
        ImageButton imgButton4 = (ImageButton) findViewById(R.id.imgButton4);
        ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DictionaryActivity.class);
                startActivity(intent); // 딕셔너리 액티비티로 이동
            }
        });

        imgButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), D5AActivity.class);
                startActivity(intent); // 무좀 원인 액티비티로 전환환
            }
        });

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), D5BActivity.class);
                startActivity(intent); //무좀 증상 액티비티로 전환
            }
        });

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), D5CActivity.class);
                startActivity(intent); //무좀 치료법 액티비티로 전환
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),D51Activity.class);
                startActivity(intent); //세부적 무좀 액티비티로 전환
            }
        });


    }
}
