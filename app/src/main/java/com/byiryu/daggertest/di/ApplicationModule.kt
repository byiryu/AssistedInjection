package com.byiryu.daggertest.di

import API_BASE_URL
import com.byiryu.daggertest.api.ApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton



@Module
class ApplicationModule{

    @Singleton
    @Provides
    fun provideRetrofit() : Retrofit{
        return Retrofit.Builder().baseUrl(API_BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provieRetrofitService(retrofit: Retrofit) : ApiService {
        return retrofit.create(ApiService::class.java)
    }
}
