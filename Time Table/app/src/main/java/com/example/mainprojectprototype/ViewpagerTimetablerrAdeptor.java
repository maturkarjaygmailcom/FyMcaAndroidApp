package com.example.mainprojectprototype;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewpagerTimetablerrAdeptor extends FragmentPagerAdapter {
    public ViewpagerTimetablerrAdeptor(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if(i==0){
            return new rr_monFragment();
        }else if(i == 1){
            return new rr_wedFragment();
        }else if(i == 2){
            return new  rr_thuFragment();
        } else if(i == 3){
            return new rr_friFragment();
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
            return "mon";
        } else if (i == 1) {
            return "wed";
        }else if(i == 2) {
            return "thu";
        }else if(i == 3) {
            return "fri";
        }

        return null;
    }
}


//ViewpagerTimetablespriAdeptor