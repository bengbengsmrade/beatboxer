package com.marwilin.beatboxer;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private String[] tabTitles = {"Light", "Dark"};

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    //ovo je za prikaz imena taba za swipe, ako zelim da mi pise
    /*@Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
    */


    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = new LightFragment();
                break;
            case 1:
                fragment = new DarkFragment();
                break;
        }

        return fragment;
    }



    @Override
    public int getCount() {
        return tabTitles.length;
    }

}
