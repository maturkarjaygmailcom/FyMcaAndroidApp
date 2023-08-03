package com.example.mainprojectprototype;

        import android.support.design.widget.TabLayout;
        import android.support.v4.view.ViewPager;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;

public class timeTablejt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_tablejt);

        TabLayout tabLay;
        ViewPager viewPage;




        tabLay=findViewById(R.id.tabLayjt);
        viewPage=findViewById(R.id.viewPagejt);

        ViewpagerTimetablejtAdeptor adeptor=new ViewpagerTimetablejtAdeptor(getSupportFragmentManager());
        viewPage.setAdapter(adeptor);
        tabLay.setupWithViewPager(viewPage);

    }
}

