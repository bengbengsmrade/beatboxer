package com.marwilin.beatboxer;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.PreferenceFragment;
import android.widget.Toast;


/**
 * Created by Marko on 18.10.2016..
 */

public class CustomPreferenceFragment extends PreferenceFragment implements SharedPreferences.OnSharedPreferenceChangeListener {

    public static final String KEY_THEME = "theme";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
        onSharedPreferenceChanged(null, "");
    }

    //dohvaćam iz postavki koja mi je tema odabrana, bijela ili crna, ali kako mijenjati tab layout iz ovog koda?
    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        // just update all
        ListPreference lp = (ListPreference) findPreference(KEY_THEME);
        lp.setSummary("Ćorak");
        lp.setSummary(getString(R.string.theme) + ": %s");

        switch (lp.getValue()) {
            case "1":
                Toast.makeText(getActivity(), "Bijeli layout", Toast.LENGTH_SHORT).show();
                break;
            case "2":
                Toast.makeText(getActivity(), "Crni layout", Toast.LENGTH_SHORT).show();

                break;

        }

    }

    @Override
    public void onResume() {
        super.onResume();
        getPreferenceManager().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);

    }

    @Override
    public void onPause() {
        getPreferenceManager().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
        super.onPause();
    }
}