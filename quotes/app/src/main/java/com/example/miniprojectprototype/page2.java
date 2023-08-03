package com.example.miniprojectprototype;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class page2 extends AppCompatActivity {


     int i=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        getSupportActionBar().hide();

        String arrmain[]={
                "However difficult life may seem,there is always something you can do and succeed at.",
                "Success isn’t overnight. It’s when everyday you get a little better than the day before. It all adds up.",
                "Success comes when people act together; failure tends to happen alone.",
                "If you find it in your heart to care for somebody else,you will have succeeded.",
                "Great things in business are never done by one person. They’re done by a team of people.",
                "Individual honors come with team success.",
                "The secret of the team’s success is easy – unity and hard work.",
                "The way a team plays as a whole determines its success.",
                "The achievements of an organization are the results of the combined effort of each individual.",
                "There is no such thing as a self-made man. You will reach your goals only with the help of others.",
                "It is literally true that you can succeed best and quickest by helping others to succeed.",
                "Success is not final,failure is not fatal: it is the courage to continue that counts.",
                "Failures,repeated failures,are finger posts on the road to achievement. One fails forward toward success.",
                "Even a mistake may turn out to be the one thing necessary to a worthwhile achievement.",
                "It is hard to fail,but it is worse never to have tried to succeed."
        };

        String arrmini[]={
                "Stephen Hawking",
                "Dwayne Johnson",
                "Deepak Chopra",
                "Maya Angelou",
                "Steve Jobs",
                "Gilbert Arenas",
                "David Beckham",
                "Babe Ruth",
                "Vince Lombardi",
                "George Shinn",
                "Napoleon Hill",
                "Winston Churchill",
                "C. S. Lewis",
                "Theodore Roosevelt",
                "unknown"
        };
        String opmini,opmain;
        Button btnprious,btnnext,btncopy;
        TextView txtmain,txtsub;

        btncopy=findViewById(R.id.btncopy);
        btnnext=findViewById(R.id.btnnext);
        btnprious=findViewById(R.id.btnprious);

        txtmain=findViewById(R.id.txtmain);
        txtsub=findViewById(R.id.txtsub);


onload();
        if(i==-1) {
            i = 0;
            txtmain.setText("" + arrmain[i]);
            txtsub.setText("" + arrmini[i]);
        }

        btncopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String opmain=txtmain.getText().toString();
                String opmini=txtsub.getText().toString();
                String op=opmain+"  - "+opmini;

                if(op.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Not Copied",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ClipboardManager ClipboardManager =(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                    ClipData clipData=ClipData.newPlainText("MyData",op);
                    ClipboardManager.setPrimaryClip(clipData);
                    Toast.makeText(getApplicationContext(),"Text Copied!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//condition mAX (I==N-1)cahnge
                if(i==(arrmain.length)-1){
                    i=0;
                    txtmain.setText("" + arrmain[i]);

                    txtsub.setText("" + arrmini[i]);

                }else {
                    i++;
                    txtmain.setText("" + arrmain[i]);

                    txtsub.setText("" + arrmini[i]);

                }

            }
        });

        btnprious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CONDITION i==-1 i==0 and in loop (i=n-1)change
                if(i==-1 || i==0) {
                    i = arrmain.length-1;
                    txtmain.setText("" + arrmain[i]);
                    txtsub.setText("" + arrmini[i]);
                }else{
                    i--;
                    txtmain.setText("" + arrmain[i]);
                    txtsub.setText("" + arrmini[i]);
                }
            }
        });


    }

    private void onload() {
        int i=-1;
    }
}