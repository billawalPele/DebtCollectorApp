package com.rizaldev.debtcollector.application.builder;

import com.rizaldev.debtcollector.utils.rx.AppRxSchedulers;
import com.rizaldev.debtcollector.utils.rx.RxSchedulers;

import dagger.Module;
import dagger.Provides;

/**
 * Created by devel on 22/10/2017.
 */
@Module
public class RxModule {

    @Provides
    RxSchedulers provideRxSchedulers() {
        return new AppRxSchedulers();
    }
}
