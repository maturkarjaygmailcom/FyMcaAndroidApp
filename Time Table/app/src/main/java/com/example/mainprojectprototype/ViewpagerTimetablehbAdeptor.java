package com.example.mainprojectprototype;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewpagerTimetablehbAdeptor extends FragmentPagerAdapter {
    public ViewpagerTimetablehbAdeptor(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if(i==0){
            return new hb_monFragment();
        } else if (i == 1) {
            return new hb_tueFragment();
        }else if (i == 2) {
            return new hb_wedFragment();
        }else if(i == 3) {
            return new hb_friFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4; //no of tabs
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int i) {
        if(i==0){
            return "Mon";
        } else if (i == 1) {
            return "tue";
        }else if(i == 2){
            return "Wed";
        }else if (i == 3) {
            return "Fri";
        }

        return null;
    }
}



