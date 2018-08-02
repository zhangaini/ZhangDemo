package com.example.aaa.zhangdemo.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class MyPagerAdapter extends FragmentPagerAdapter {
    public ArrayList<Fragment> getDatas() {
        return datas;
    }

    public void setDatas(ArrayList<Fragment> datas) {
        this.datas = datas;
    }

    public ArrayList<String> getTitles() {
        return titles;
    }

    public void setTitles(ArrayList<String> titles) {
        this.titles = titles;
    }

    ArrayList<Fragment> datas;
    ArrayList<String> titles;
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return datas == null ? null : datas.get(i);
    }

    @Override
    public int getCount() {
        return datas == null ? 0 : datas.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles == null ? null : titles.get(position);
    }
}
