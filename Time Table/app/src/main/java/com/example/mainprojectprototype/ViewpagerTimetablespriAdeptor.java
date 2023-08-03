package com.example.mainprojectprototype;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewpagerTimetablespriAdeptor extends FragmentPagerAdapter {
    public ViewpagerTimetablespriAdeptor(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if(i==0){
            return new pn_tueFragment();
        }else if(i == 1){
            return new pn_thuFragment();
        }else if(i == 2){
            return new pn_satFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3; //no of tabs
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int i) {
        if(i==0){
            return "tue";
        } else if (i == 1) {
            return "Thu";
        }else if(i == 2) {
            return "Sat";
        }

        return null;
    }
}


//ViewpagerTimetablespriAdeptor