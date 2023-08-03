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

public class page4 extends AppCompatActivity {


     int i=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
        getSupportActionBar().hide();

        String arrmain[]={
                "Love is that condition in which the happiness of another person is essential to your own.",
                "Let us always meet each other with smile, for the smile is the beginning of love.",
                "Being deeply loved by someone gives you strength, while loving someone deeply gives you courage.",
                "Love is the only force capable of transforming an enemy into friend.",
                "Love and compassion are necessities, not luxuries. Without them humanity cannot survive.",
                "Love takes off masks that we fear we cannot live without and know we cannot live within.",
                "Affection is responsible for nine-tenths of whatever solid and durable happiness there is in our lives.",
                "Love cures people—both the ones who give it and the ones who receive it.",
                "The best proof of love is trust.",
                "To love oneself is the beginning of a lifelong romance.",
                "The giving of love is an education in itself."
        };

        String arrmini[]={
                        "Robert A. Heinlein",
                        "Mother Teresa",
                        "Lao Tzu",
                        "Martin Luther King",
                        "Jr.Dalai Lama",
                        "James A. Baldwin",
                        "C.S. Lewis",
                        "Karl A. Menninger",
                        "Joyce Brothers",
                        "Oscar Wilde",
                        "Eleanor Roosevelt"
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
        int i=1;
    }
}



