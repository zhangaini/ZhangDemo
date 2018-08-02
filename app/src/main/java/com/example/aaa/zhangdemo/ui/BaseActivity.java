package com.example.aaa.zhangdemo.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BaseActivity extends  AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.aaa.zhangdemo.R.layout.activity_main);
    }
}
