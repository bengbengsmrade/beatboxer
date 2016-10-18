package com.marwilin.beatboxer;


import android.os.Bundle;
import android.preference.PreferenceActivity;


/**
 * Created by Marko on 18.10.2016..
 */

public class CustomPreferenceActivity extends PreferenceActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction().replace(android.R.id.content, new CustomPreferenceFragment()).commit();
    }

}
