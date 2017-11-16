package com.rizaldev.debtcollector.application.builder;

import com.rizaldev.debtcollector.api.DebtApi;
import com.rizaldev.debtcollector.utils.rx.RxSchedulers;

import dagger.Component;


/**
 * Created by devel on 22/10/2017.
 */
@AppScope
@Component(modules = {NetworkModule.class, AppContextModule.class, RxModule.class, DebtApiServiceModule.class})
public interface AppComponent {
    RxSchedulers rxSchedulers();
    DebtApi apiService();
}
