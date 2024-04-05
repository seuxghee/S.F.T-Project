package com.cookandroid.project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MemberActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);

        
Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent); // button2 누르면 다시 LoginActivity로 돌아감.
            }
        });



    }
}
