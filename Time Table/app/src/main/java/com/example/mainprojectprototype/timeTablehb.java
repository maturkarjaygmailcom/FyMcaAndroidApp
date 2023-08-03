package com.example.mainprojectprototype;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class timeTablehb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_tablehb);

        TabLayout tabLay;
        ViewPager viewPage;



        tabLay=findViewById(R.id.tabLayhb);
        viewPage=findViewById(R.id.viewPagehb);

        ViewpagerTimetablehbAdeptor adeptor=new ViewpagerTimetablehbAdeptor(getSupportFragmentManager());
        viewPage.setAdapter(adeptor);
        tabLay.setupWithViewPager(viewPage);

    }
}




