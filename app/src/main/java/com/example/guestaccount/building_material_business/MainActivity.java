package com.example.guestaccount.building_material_business;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button submit = findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Material_one_info.class);
                startActivity(intent);
            }
        });
        Button submit1 = findViewById(R.id.button2);
        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MaterialTwoInfoActivity.class);
                startActivity(intent);
            }
        });
        Button submit2 = findViewById(R.id.button3);
        submit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MaterialThreeInfoActivity.class);
                startActivity(intent);
            }
        });

    }
}
