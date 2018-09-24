package com.example.guestaccount.building_material_business;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bharat_Cement_Store extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bharat__cement__store);

        Button give = findViewById(R.id.button4);
        give.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Bharat_Cement_Store.this,MainActivity.class);
                startActivity(intent1);
            }
        });
    }
}
