package com.marwilin.beatboxer;


import android.content.Intent;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }


    //dohvacam viewPager i tableLayout, a oni dalje peglaju s fragment light i dark
    private void init() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        SimpleFragmentPagerAdapter sfpa = new SimpleFragmentPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(sfpa);
        tabLayout.setupWithViewPager(viewPager);
    }

    //radim menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    //dodajem sve sto se dogada kad kliknem na nesto iz menua
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_contact:
               WarningDialog wd = new WarningDialog();
                wd.show(getFragmentManager(), "Warning dialog");
                break;
            case R.id.action_about:
                WarningDialogAbout wdabout = new WarningDialogAbout();
                wdabout.show(getFragmentManager(), "Warning dialog about");
                break;
            case R.id.settings:
                Intent intent = new Intent(getApplicationContext(), CustomPreferenceActivity.class);
                startActivity(intent);
                break;
        }
        return true;
    }



    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

