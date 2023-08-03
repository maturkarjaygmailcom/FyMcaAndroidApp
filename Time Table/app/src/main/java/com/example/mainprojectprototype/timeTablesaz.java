package com.example.mainprojectprototype;



import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class timeTablesaz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_tablesaz);

        TabLayout tabLay;
        ViewPager viewPage;




        tabLay=findViewById(R.id.tabLay);
        viewPage=findViewById(R.id.viewPage);

        ViewpagerTimetablesazAdeptor adeptor=new ViewpagerTimetablesazAdeptor(getSupportFragmentManager());
        viewPage.setAdapter(adeptor);
        tabLay.setupWithViewPager(viewPage);

    }
}