package com.location.mvp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import com.location.R;


/**
 * Created by xianguo on 28/6/16.
 */
public class ReportPresenter implements ReportContact.Presenter {
    private ReportActivity mReportActivity;

    private ReportFragment mReportFragment;

    public ReportPresenter(ReportFragment reportFragment) {
        this.mReportFragment = reportFragment;
    }

    String currentTag = ReportFragment.TAG;

    @Override
    public void selectFragment(String tag) {
        if (currentTag.equals(tag)) tag = ReportFragment.TAG;
        FragmentManager manager = mReportActivity.getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        Fragment fragment = manager.findFragmentByTag(tag);
        Fragment currentFragment = manager.findFragmentByTag(currentTag);

        if (currentFragment != null) transaction.hide(currentFragment);
        if (ReportFragment.TAG.equals(tag)) {
            if(fragment==null) {
                fragment = new ReportFragment();
                transaction.add(R.id.activity_container,fragment, tag);
            }else{
                transaction.show(fragment);
            }
        }
        if (SaleFormsFragment.TAG.equals(tag)){
            if(fragment==null){
                fragment = new SaleFormsFragment();
                transaction.add(R.id.activity_container,fragment,tag);
            }else {
                transaction.show(fragment);
            }
        }

    }

    @Override
    public void loadData() {

    }

    @Override
    public void start() {

    }

    public void setActivity(ReportActivity activity) {
        this.mReportActivity = activity;
    }

    public void onDestroy() {
    }
}
