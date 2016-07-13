package com.location.mvp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import rx.Subscription;

/**
 * Created by xianguo on 28/6/16.
 */
public class ReportFragment extends Fragment implements ReportContact.OverviewView {
    public static final String TAG = ReportFragment.class.getSimpleName();

    private ReportContact.Presenter mPresenter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return null;
    }

    @Override
    public boolean isSelected() {
        return false;
    }

    @Override
    public void fillData() {

    }

    @Override
    public void setPresenter(ReportContact.Presenter presenter) {
        this.mPresenter = presenter;
    }

    @Override
    public void addSubscription(Subscription subscription) {

    }
}
