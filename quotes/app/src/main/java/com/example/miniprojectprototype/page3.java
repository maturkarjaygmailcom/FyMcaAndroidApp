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

public class page3 extends AppCompatActivity {


     int i=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        getSupportActionBar().hide();

        String arrmain[]={
                "A real friend is one who walks in when the rest of the world walks out.",
                "If you live to be 100,  I hope I live to be 100 minus 1 day, so I never have to live without you.",
                "I like to listen. I have learned a great deal from listening carefully. Most people never listen.",
                "Friendship is born at that moment when one person says to another, ‘What! You too? I thought I was the only one.",
                "True friendship comes when the silence between two people is comfortable.",
                "Sweet is the memory of distant friends! Like the mellow rays of the departing sun,  it falls tenderly,  yet sadly,  on the heart.",
                "There’s not a word yet for old friends who’ve just met.",
                "A single rose can be my garden… a single friend, my world.",
                "Don’t make friends who are comfortable to be with. Make friends who will force you to lever yourself up.",
                "You can  make more friends in two months by becoming interested in other people than you can in two years by trying to get other people interested in you.",
                "A friend is someone who understands your past, believes in your future, and accepts you just the way you are."
        };

        String arrmini[]={
                "Walter Winchell",
                "Winnie the Pooh",
                "Ernest Hemingway",
                "C.S. Lewis",
                "David Tyson",
                "Washington Irving",
                "Jim Henson",
                "Leo Buscaglia",
                "Thomas J. Watson",
                "Dale Carnegie",
                "Unknown"
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