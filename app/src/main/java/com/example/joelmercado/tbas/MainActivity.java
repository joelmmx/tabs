package com.example.joelmercado.tbas;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.widget.TextView;

/**
 * Created by joelmercado on 18/02/18.
 */

public class MainActivity extends FragmentActivity {

    private FragmentTabHost tabHost;

    /**
     * Perform initialization of all fragments and loaders.
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabHost= (FragmentTabHost) findViewById(android.R.id.tabhost);
        tabHost.setup(this,getSupportFragmentManager(),android.R.id.tabhost);
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("_lengueta 1"),Tab1.class,null);
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("_lengueta 2"),Tab2.class,null);
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("_lengueta 3"),Tab3.class,null);

    }
}
