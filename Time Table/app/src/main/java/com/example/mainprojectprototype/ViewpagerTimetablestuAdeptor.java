package com.example.mainprojectprototype;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewpagerTimetablestuAdeptor extends FragmentPagerAdapter {
    public ViewpagerTimetablestuAdeptor(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        
        if(i==0){
            return new monFragment();
        }
        else if (i == 1) {
            return new tueFragment();
        }else if (i == 2) {
            return new wedFragment();
        }else if(i == 3){
            return new thuFragment();
        }else if (i == 4){
            return new friFragment();
        } else if (i == 5) {
            return new satFragment();
        } else if (i==6) {
            return new facultyDetailActivity();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 7; //no of tabs
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int i) {
        if(i==0){
            return "Mon";
        }
        else if (i == 1) {
            return "Tue";
        }else if(i == 2){
            return "Wed";
        }else if (i == 3){
            return "Thu";
        } else if (i == 4) {
            return "Fri";
        }else if (i == 5) {
            return "Sat";
        } else if (i==6) {
            return "Info";
        }

        return null;
    }
}





