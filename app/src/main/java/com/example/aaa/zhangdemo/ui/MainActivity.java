package com.example.aaa.zhangdemo.ui;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.example.aaa.zhangdemo.R;
import com.example.aaa.zhangdemo.adapter.MyPagerAdapter;
import com.example.aaa.zhangdemo.fragment.FirstFragment;
import com.example.aaa.zhangdemo.fragment.FourFragment;
import com.example.aaa.zhangdemo.fragment.SecondFragment;
import com.example.aaa.zhangdemo.fragment.ThreeFragment;

import java.util.ArrayList;
import java.util.List;
/*
        我们的标题有多条，导致超出了TabLayout的显示范围，这该如何解决呢？很简单，查阅官方API发现
        TabLayout有一个方法是setTabMode，它是用来设置TabLayout的展示模式，而这个方法接受两个常量，
        MODE_SCROLLABLE 以及 MODE_FIXED，显而易见，当我们设置为MODE_SCROLLABLE 它就能自动根据标题
        的数量，滑动展示啦，功能到这里就完美实现了！


 */
public class MainActivity extends AppCompatActivity {

    private TabLayout mTab;
    private ViewPager mViewPager;
    private ArrayList<Fragment> mListFragment;
    private MyPagerAdapter myPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }
//初始化首页的数据
    private void initData() {
        mTab=findViewById(R.id.MyTablayout);
        mViewPager=findViewById(R.id.myViewPager);
        ArrayList mTitle=new ArrayList();
        mTitle.add("第1");
        mTitle.add("第2");
        mTitle.add("第3");
        mTitle.add("第4");
        mListFragment=new ArrayList<>();
        mListFragment.add(new FirstFragment());
        mListFragment.add(new SecondFragment());
        mListFragment.add(new ThreeFragment());
        mListFragment.add(new FourFragment());
        myPagerAdapter=new MyPagerAdapter(getSupportFragmentManager());
        myPagerAdapter.setDatas(mListFragment);
        myPagerAdapter.setTitles(mTitle);
        mViewPager.setAdapter(myPagerAdapter);
        mTab.setupWithViewPager(mViewPager);

    }
}
