package com.example.mainprojectprototype;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class timeTablerr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_tablerr);

        TabLayout tabLay;
        ViewPager viewPage;




        tabLay=findViewById(R.id.tabLayrr);
        viewPage=findViewById(R.id.viewPagerr);

        ViewpagerTimetablerrAdeptor adeptor=new ViewpagerTimetablerrAdeptor(getSupportFragmentManager());
        viewPage.setAdapter(adeptor);
        tabLay.setupWithViewPager(viewPage);

    }
}

