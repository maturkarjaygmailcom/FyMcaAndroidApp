package com.example.mainprojectprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class facultyPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_page);

        EditText edituser,editpass;
        TextView txtWorning;
        Button btnLogin;
        Intent choseyourSelf=new Intent(this,choseyourself.class);

        txtWorning=findViewById(R.id.txtWorning);

        edituser=findViewById(R.id.edituser);
        editpass=findViewById(R.id.editpass);

        btnLogin=findViewById(R.id.btnlogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                startActivity(choseyourSelf);

                if(edituser.getText().toString().equals("admin")) {
                    if (editpass.getText().toString().equals("admin@321")) {
                        startActivity(choseyourSelf);
                    } else {
                        txtWorning.setText("Invalid password");
                    }
                }
                else {
                    txtWorning.setText("Invalid user name or password");
//                    txtWorning.setText(""+edituser.getText().toString());

                }


            }
        });
    }
}