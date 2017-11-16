package com.rizaldev.debtcollector.application.builder;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.rizaldev.debtcollector.api.DebtApi;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by devel on 22/10/2017.
 */
@Module
public class DebtApiServiceModule {
    private static final String BASE_URL = "http://coemygroup.fr/";
    @AppScope
    @Provides
    DebtApi provideApiService(OkHttpClient client, GsonConverterFactory gson, RxJava2CallAdapterFactory rxAdapter)
    {
        Retrofit retrofit =   new Retrofit.Builder().client(client)
                .baseUrl(BASE_URL).addConverterFactory(gson).
                        addCallAdapterFactory(rxAdapter).build();

        return  retrofit.create(DebtApi.class);
    }

}
