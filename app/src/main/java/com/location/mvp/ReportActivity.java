package com.location.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.location.R;

/**
 * Created by xianguo on 28/6/16.
 */
public class ReportActivity extends AppCompatActivity {
    private ReportPresenter mPresenter;

    private ReportFragment mReportFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new ReportPresenter(getReportFragment());
        mPresenter.setActivity(this);
        mPresenter.start();
        mPresenter.selectFragment(ReportFragment.TAG);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.onDestroy();
    }

    public ReportFragment getReportFragment() {
        if (mReportFragment == null) {
            mReportFragment = new ReportFragment();
        }
        return mReportFragment;
    }
}
