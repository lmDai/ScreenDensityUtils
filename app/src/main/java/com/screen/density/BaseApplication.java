package com.screen.density;

import android.app.Application;

import com.screen.density.utils.DensityUtils;

/**
 * https://www.jianshu.com/p/d573e6d28f31
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DensityUtils.setDensity(this);
    }
}
