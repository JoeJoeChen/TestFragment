package com.example.testfragment;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class MainActivity extends FragmentActivity
{
    /** 页面list **/
    List<Fragment> fragmentList = new ArrayList<Fragment>();
    /** 页面title list **/
    List<String> titleList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vp = (ViewPager) findViewById(R.id.viewPager);
        fragmentList.add(new SubFragment("页面1"));
        fragmentList.add(new SubFragment("页面2"));
        fragmentList.add(new SubFragment("页面3"));
        titleList.add("title 1 ");
        titleList.add("title 2 ");
        titleList.add("title 3 ");  
        vp.setAdapter(new PagerAdapter(getSupportFragmentManager(), fragmentList, titleList));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

}
