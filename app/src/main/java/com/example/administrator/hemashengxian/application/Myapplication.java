package com.example.administrator.hemashengxian.application;

import android.app.Application;

import com.vondear.rxtool.RxTool;
import com.zhy.autolayout.config.AutoLayoutConifg;

/**
 * Created by Administrator on 2019/4/27.
 */

public class Myapplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AutoLayoutConifg.getInstance().useDeviceSize();
        RxTool.init(this);
    }
}
