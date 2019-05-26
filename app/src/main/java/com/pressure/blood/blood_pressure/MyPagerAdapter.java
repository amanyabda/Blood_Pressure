package com.pressure.blood.blood_pressure;


import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyPagerAdapter extends FragmentStatePagerAdapter {
    final int BLUE_FRAGMENT = 1;
    final int PURPLE_FRAGMENT = 0;
    final int FRAGMENT3 = 2;

    final int COUNT = 3;
    private final Context context;

    public MyPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){


            case BLUE_FRAGMENT:
                fragment = new Fragment2();
                break;

            case PURPLE_FRAGMENT:
                fragment = new Fragment1();
                break;
            case FRAGMENT3:
                fragment = new Fragment3();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String fragment = null;
        switch (position){

            case PURPLE_FRAGMENT:
                fragment = context.getString(R.string.purple);
                break;

            case BLUE_FRAGMENT:
                fragment = context.getString(R.string.blue);
                break;
            case FRAGMENT3:
                fragment = context.getString(R.string.fragment3);
                break;


        }
        return fragment;
    }
}