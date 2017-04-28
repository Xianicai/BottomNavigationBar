package com.example.xianicai.bottomnavigationbar;


import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

public class MainActivity extends AppCompatActivity implements BottomNavigationBar.OnTabSelectedListener  {


    private BottomNavigationBar mBottomNavigationBar;
    private String[] mTitles = new String[]{"首页", "发现", "信息", "我的"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBottomNavigationBar = (BottomNavigationBar)findViewById(R.id.bottomNavigationBar);
        intview();
    }

    private void intview() {
        mBottomNavigationBar
                .setActiveColor(R.color.yellow)
                .setInActiveColor(R.color.black)
                .setBarBackgroundColor(R.color.white);

        mBottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED);
        mBottomNavigationBar
                .setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC
                );
        mBottomNavigationBar
                .addItem(new BottomNavigationItem(R.mipmap.ic_tabbar_home_pressed, mTitles[0])
                        .setInactiveIcon(ContextCompat.getDrawable(this, R.mipmap.ic_tabbar_home_normal)))
                .addItem(new BottomNavigationItem(R.mipmap.ic_tabbar_discover_pressed, mTitles[1])
                        .setInactiveIcon(ContextCompat.getDrawable(this, R.mipmap.ic_tabbar_discover_normal)))
                .addItem(new BottomNavigationItem(R.mipmap.ic_tabbar_feed_pressed, mTitles[2])
                        .setInactiveIcon(ContextCompat.getDrawable(this, R.mipmap.ic_tabbar_feed_normal)))
                .addItem(new BottomNavigationItem(R.mipmap.ic_tabbar_me_pressed, mTitles[3])
                        .setInactiveIcon(ContextCompat.getDrawable(this, R.mipmap.ic_tabbar_me_normal)))
                .setFirstSelectedPosition(0)
                .initialise();
        mBottomNavigationBar.setTabSelectedListener(MainActivity.this);
    }

    @Override
    public void onTabSelected(int position) {

    }

    @Override
    public void onTabUnselected(int position) {

    }

    @Override
    public void onTabReselected(int position) {

    }
}
