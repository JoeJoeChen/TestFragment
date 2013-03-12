package com.example.testfragment;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class PagerAdapter extends FragmentPagerAdapter
{

    private List<Fragment> fragmentList;
    private List<String> titleList;

    public PagerAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList)
    {
        super(fm);
        this.fragmentList = fragmentList;
        this.titleList = titleList;
    }

    /**
     * �õ�ÿ��ҳ��
     */
    @Override
    public Fragment getItem(int arg0)
    {
        return (fragmentList == null || fragmentList.size() == 0) ? null : fragmentList.get(arg0);
    }

    /**
     * ÿ��ҳ���title
     */
    @Override
    public CharSequence getPageTitle(int position)
    {
        return (titleList.size() > position) ? titleList.get(position) : "";
    }

    /**
     * ҳ����ܸ���
     */
    @Override
    public int getCount()
    {
        return fragmentList == null ? 0 : fragmentList.size();
    }
}