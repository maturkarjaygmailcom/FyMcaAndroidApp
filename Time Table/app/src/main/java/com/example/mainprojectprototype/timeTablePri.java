package com.example.mainprojectprototype;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class timeTablePri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table_pri);

        TabLayout tabLay;
        ViewPager viewPage;




        tabLay=findViewById(R.id.tabLaypri);
        viewPage=findViewById(R.id.viewPagepri);

        ViewpagerTimetablespriAdeptor adeptor=new ViewpagerTimetablespriAdeptor(getSupportFragmentManager());
        viewPage.setAdapter(adeptor);
        tabLay.setupWithViewPager(viewPage);

    }
}