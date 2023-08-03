package com.example.mainprojectprototype;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewpagerTimetablejtAdeptor extends FragmentPagerAdapter {
    public ViewpagerTimetablejtAdeptor(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if(i==0){
            return new jt_satFragment();
        }else if(i == 1) {
            return new jt_wedFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2; //no of tabs
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int i) {
        if(i==0){
            return "wed";
        }else if(i == 1) {
            return "Sat";
        }

        return null;
    }
}



//ViewpagerTimetablejtAdeptor