package com.screen.density;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.screen.density.utils.DensityUtils;

import butterknife.ButterKnife;

/**
 * https://www.jianshu.com/p/d573e6d28f31
 */

public abstract class BaseActivity extends AppCompatActivity {
    protected Context mContext;
    protected Activity mActivity;
    protected Context appContext;
    protected Application mApplication;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        mActivity = this;
        appContext = getApplicationContext();
        mApplication = getApplication();
        setOrientation();
        setContentView(getLayout());
        ButterKnife.bind(this);
        initEvent();
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }

    public void setOrientation() {
        DensityUtils.setDefault(mActivity);
    }

    protected abstract int getLayout();

    protected abstract void initEvent();
}
