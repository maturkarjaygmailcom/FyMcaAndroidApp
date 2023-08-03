package com.example.mainprojectprototype;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewpagerTimetableylAdeptor extends FragmentPagerAdapter {
    public ViewpagerTimetableylAdeptor(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if(i==0){
            return new yl_monFragment();
        }else if(i == 1){
            return new yl_tueFragment();
        }else if(i == 2){
            return new  yl_wedFragment();
        } else if(i == 3){
            return new yl_thuFragment();
        } else if(i == 4){
            return new yl_friFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5; //no of tabs
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int i) {
        if(i==0){
            return "mon";
        } else if (i == 1) {
            return "tue";
        }else if (i == 2) {
            return "wed";
        }else if(i == 3) {
            return "thu";
        }else if(i == 4) {
            return "fri";
        }

        return null;
    }
}


//ViewpagerTimetablespriAdeptor