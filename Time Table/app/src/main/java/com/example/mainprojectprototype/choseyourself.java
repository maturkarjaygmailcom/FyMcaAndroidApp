package com.example.mainprojectprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class choseyourself extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choseyourself);

        Button btnpri,btnsaz,btnjt,btnrr,btnhb,btnyl;
        btnsaz=findViewById(R.id.btnsaz);
        btnpri=findViewById(R.id.btnpri);
        btnjt=findViewById(R.id.btnjt);
        btnrr=findViewById(R.id.btnrr);
        btnhb=findViewById(R.id.btnhb);
        btnyl=findViewById(R.id.btnyl);


        Intent timeTablePri=new Intent(this, com.example.mainprojectprototype.timeTablePri.class);
        Intent timeTablesaz=new Intent(this, com.example.mainprojectprototype.timeTablesaz.class);
        Intent timeTablejt=new Intent(this, com.example.mainprojectprototype.timeTablejt.class);
        Intent timeTablerr=new Intent(this, com.example.mainprojectprototype.timeTablerr.class);

        Intent timeTablehb=new Intent(this, com.example.mainprojectprototype.timeTablehb.class);
        Intent timeTableyl=new Intent(this, com.example.mainprojectprototype.timeTableyl.class);

        btnpri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(timeTablePri);
            }
        });

        btnsaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(timeTablesaz);
            }
        });

        btnjt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(timeTablejt);
            }
        });
        btnrr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(timeTablerr);
            }
        });
        btnyl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(timeTableyl);
            }
        });
        btnhb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(timeTablehb);
            }
        });

    }
}