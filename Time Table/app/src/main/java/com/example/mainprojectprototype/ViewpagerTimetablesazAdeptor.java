package com.example.mainprojectprototype;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewpagerTimetablesazAdeptor extends FragmentPagerAdapter {
    public ViewpagerTimetablesazAdeptor(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
            if(i==0){
                return new ss_monFragment();
            } else if (i == 1) {
                return new ss_tueFragment();
            }else if (i == 2) {
                return new ss_wedFragment();
            }else if(i == 3){
                return new ss_thuFragment();
            }else if (i == 4){
                return new ss_friFragment();
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
            return "Mon";
        } else if (i == 1) {
            return "tue";
        }else if(i == 2){
            return "Wed";
        }else if (i == 3){
            return "Thu";
        } else if (i == 4) {
            return "Fri";
        }

        return null;
    }
}


