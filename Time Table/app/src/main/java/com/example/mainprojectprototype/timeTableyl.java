package com.example.mainprojectprototype;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class timeTableyl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_tableyl);

        TabLayout tabLay;
        ViewPager viewPage;




        tabLay=findViewById(R.id.tabLayyl);
        viewPage=findViewById(R.id.viewPageyl);

        ViewpagerTimetableylAdeptor adeptor=new ViewpagerTimetableylAdeptor(getSupportFragmentManager());
        viewPage.setAdapter(adeptor);
        tabLay.setupWithViewPager(viewPage);

    }
}

