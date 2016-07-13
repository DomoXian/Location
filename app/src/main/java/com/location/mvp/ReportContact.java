package com.location.mvp;

/**
 * Created by xianguo on 28/6/16.
 */
public interface ReportContact {
    interface OverviewView extends BaseView<Presenter>{
        boolean isSelected();

        void fillData();

    }
    interface Presenter extends BasePresenter{
        void selectFragment(String tag);

        void loadData();
    }
}
