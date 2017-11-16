package com.rizaldev.debtcollector.screens.splash.dagger;

import com.rizaldev.debtcollector.screens.splash.SplashActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by devel on 23/10/2017.
 */
@Module
public class SplashContextModule {
    SplashActivity splashContext;

    public SplashContextModule(SplashActivity context){
        this.splashContext = context;
    }

    @SplashScope
    @Provides
    SplashActivity provideSplashContext(){
        return splashContext;
    }
}
