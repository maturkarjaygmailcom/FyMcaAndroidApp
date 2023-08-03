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

public class page1 extends AppCompatActivity {

     int i=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        getSupportActionBar().hide();

        String arrmain[]={
                "Develop success from failures. Discouragement and failure are two of the surest stepping stones to success.",
                "If the highest aim of a captain were to preserve his ship,he would keep it in port forever.",
                "The only way of discovering the limits of the possible is to venture a little way past them into the impossible.",
                "You can get everything in life you want if you will just help enough other people get what they want.",
                "Inspiration does exist,but it must find you working.",
                "Don't bunt. Aim out of the ballpark. Aim for the company of immortals.",
                "If there is no struggle,there is no progress.",
                "What you do makes a difference, and you have to decide what kind of difference you want to make.",
                "I choose to make the rest of my life the best of my life.",
                "In order to be irreplaceable one must always be different.",
                "Anything can make me stop and look and wonder, and sometimes learn.",
                "People'spassion and desire for authenticity is strong.",
                "A surplus of effort could overcome a deficit of confidence.",
                "There are three ways to ultimate success: The first way is to be kind. The second way is to be kind. The third way is to be kind.",
                "No one changes the world who isn’t obsessed."
        };

        String arrmini[]={
                "Dale Carnegie",
                "Thomas Aquinas",
                "Arthur C. Clarke",
                "Zig Ziglar",
                "Pablo Picasso",
                "Isabel Allende",
                "David Ogilvy",
                "Frederick Douglass",
                "Jane Goodall",
                "Louise Hay",
                "Coco Chanel",
                "Kurt Vonnegut",
                "Constance Wu",
                "Sonia Sotomayor",
                "Mister Rogers"
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