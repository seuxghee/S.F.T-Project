package com.cookandroid.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class D41Activity extends AppCompatActivity {
    Button button2;
    ImageView imageView4, imageView5, imageView7 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d4_1);


        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), D4Activity.class);
                startActivity(intent); // 습진 사전 액티비티로 전환
            }
        });
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), D41AActivity.class);
                startActivity(intent); //아토피 피부염 액티비티로 전환
            }
        });
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),D41BActivity.class);
                startActivity(intent); //건성 습진 액티비티로 전환
            }
        });
        ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), D41CActivity.class);
                startActivity(intent); // 접촉성 피부염 액티비티로 전환
            }
        });

    }
}
