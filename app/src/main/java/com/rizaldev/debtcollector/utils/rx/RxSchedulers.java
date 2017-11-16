package com.rizaldev.debtcollector.utils.rx;


import io.reactivex.Scheduler;

/**
 * Created by devel on 22/10/2017.
 */


public interface RxSchedulers {
    Scheduler runOnBackground();
    Scheduler io();
    Scheduler compute();
    Scheduler androidThread();
    Scheduler internet();
}
