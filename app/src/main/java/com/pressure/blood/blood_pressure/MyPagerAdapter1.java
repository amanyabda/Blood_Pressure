package com.pressure.blood.blood_pressure;


import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyPagerAdapter1 extends FragmentStatePagerAdapter {
    final int FRAGMENT11 = 0;
    final int FRAGMENT22 = 1;
    final int FRAGMENT44=2;
    final int COUNT = 3;
    private final Context context;

    public MyPagerAdapter1(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){

            case FRAGMENT11:
                fragment = new Fragment11();
                break;
            case FRAGMENT22:
                fragment = new Fragment22();
                break;
            case FRAGMENT44:
                fragment = new Fragment44();
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

            case FRAGMENT11:
                fragment = context.getString(R.string.fragment11);
                break;

            case FRAGMENT22:
            fragment = context.getString(R.string.fragment22);
                break;

            case FRAGMENT44:
                fragment = context.getString(R.string.fragment44);
                break;
        }
        return fragment;
    }
}