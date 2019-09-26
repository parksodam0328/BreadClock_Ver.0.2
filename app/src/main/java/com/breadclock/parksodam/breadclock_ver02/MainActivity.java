package com.breadclock.parksodam.breadclock_ver02;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.breadclock.parksodam.breadclock_ver02.Adapter.FragmentPagerAdapter;
import com.breadclock.parksodam.breadclock_ver02.Fragment.MapFragment;
import com.breadclock.parksodam.breadclock_ver02.Fragment.NoticeFragment;
import com.breadclock.parksodam.breadclock_ver02.Fragment.SettingFragment;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    private FragmentPagerAdapter m_FragmentPagerAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize
        Initialze();
    }

    private void Initialze(){
        if(m_FragmentPagerAdapter == null){
            m_FragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager());
        }

        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        setupViewPager(mViewPager);
        mTabLayout = (TabLayout) findViewById(R.id.tabLayout);
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF")); // 밑줄색
    }

    private void setupViewPager(ViewPager viewPager) {
        m_FragmentPagerAdapter.addFragment(new MapFragment(), "지도");
        m_FragmentPagerAdapter.addFragment(new NoticeFragment(), "알람");
        m_FragmentPagerAdapter.addFragment(new SettingFragment(), "도움말");
        viewPager.setAdapter(m_FragmentPagerAdapter);
    }
}
