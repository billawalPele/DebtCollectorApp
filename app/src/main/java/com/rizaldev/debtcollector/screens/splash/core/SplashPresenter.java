package com.rizaldev.debtcollector.screens.splash.core;

import com.rizaldev.debtcollector.utils.rx.RxSchedulers;

import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by devel on 22/10/2017.
 */

public class SplashPresenter {

    private SplashView view;
    private SplashModel model;
    private RxSchedulers rxSchedulers;
    private CompositeDisposable subscriptions;

    public SplashPresenter(SplashView view,SplashModel model, RxSchedulers schedulers, CompositeDisposable subscriptions) {
        this.view = view;
        this.model = model;
        this.rxSchedulers = schedulers;
        this.subscriptions = subscriptions;
    }

    public void onCreate() {
        // TODO: Usage of network available check
        // Boolean networkAvailable = subscriptions.add(model.isNetworkAvailable().subscribe());
        subscriptions.add(model.delaySplash());
        view.showAnimation(2000);
    }

    public void onDestroy() {
        subscriptions.clear();
    }

}
