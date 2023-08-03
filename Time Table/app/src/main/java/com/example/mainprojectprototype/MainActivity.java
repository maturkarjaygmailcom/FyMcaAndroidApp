package com.example.mainprojectprototype;

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

        Button btnStu,btnFacul;
        btnStu=findViewById(R.id.btnStu);
        btnFacul=findViewById(R.id.btnFacul);

        Intent studentPage =new Intent(this,studentPage.class);
        Intent facultyPage =new Intent(this,facultyPage.class);

        btnStu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(studentPage);
            }
        });

        btnFacul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(facultyPage);
            }
        });
    }
}