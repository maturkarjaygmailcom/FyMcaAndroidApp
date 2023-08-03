package com.example.mainprojectprototype;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class studentTimetable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_timetable);

        TabLayout tabLay;
        ViewPager viewPage;




        tabLay=findViewById(R.id.tabLaystu);
        viewPage=findViewById(R.id.viewPagestu);

        ViewpagerTimetablestuAdeptor adeptorstu=new ViewpagerTimetablestuAdeptor(getSupportFragmentManager());
        viewPage.setAdapter(adeptorstu);
        tabLay.setupWithViewPager(viewPage);
    }
}