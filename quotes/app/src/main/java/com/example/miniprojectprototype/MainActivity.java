package com.example.miniprojectprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//import java.awt.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        Button btn1,btn2,btn3,btn4;

            btn1=findViewById(R.id.btnfirst);
            btn2=findViewById(R.id.btnsec);
          btn3=findViewById(R.id.btnthred);
        btn4=findViewById(R.id.btnfour);

        Intent fromBtn1 =new Intent(MainActivity.this,page1.class);
        Intent fromBtn2 =new Intent(MainActivity.this,page2.class);

        Intent fromBtn3 =new Intent(MainActivity.this,page3.class);
        Intent fromBtn4 =new Intent(MainActivity.this,page4.class);
        Intent fromBtn5 =new Intent(MainActivity.this,page5.class);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(fromBtn1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { startActivity(fromBtn2);}
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(fromBtn3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(fromBtn4);
            }
        });
    }
}
