package com.breadclock.parksodam.breadclock_ver02.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import java.util.ArrayList;
import java.util.List;

public class FragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {
    private List<Fragment> m_lstFragment = null;
    private List<String> m_lstFragmentTitle = null;

    public FragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        m_lstFragment = new ArrayList<>();
        m_lstFragmentTitle = new ArrayList<>();
    }

    public void addFragment(Fragment fragment, String strFragmentTitle){
        m_lstFragment.add(fragment);
        m_lstFragmentTitle.add(strFragmentTitle);
    }

    public CharSequence getPageTitle(int position) {
        return m_lstFragmentTitle.get(position);
    }

    @Override
    public Fragment getItem(int postion) {
        return m_lstFragment.get(postion);
    }

    @Override
    public int getCount() {
        return m_lstFragment.size();
    }
}
