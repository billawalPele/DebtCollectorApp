package com.rizaldev.debtcollector.screens.splash.dagger;

import com.rizaldev.debtcollector.application.builder.AppComponent;
import com.rizaldev.debtcollector.screens.splash.SplashActivity;

import dagger.Component;

/**
 * Created by devel on 23/10/2017.
 */

@SplashScope
@Component(modules = {SplashContextModule.class,SplashModule.class},dependencies = {AppComponent.class})
public interface SplashComponent {
    void inject(SplashActivity activity);
}
