package com.location.mvp;

import rx.Subscription;

/**
 * Created by xianguo on 28/6/16.
 */
public interface BaseView<T> {
    void setPresenter(T presenter);

    void addSubscription(Subscription subscription);
}
