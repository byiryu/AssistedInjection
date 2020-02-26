package com.byiryu.daggertest

import android.app.Activity
import android.app.Application
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.HasAndroidInjector
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import com.byiryu.daggertest.di.AppComponent
import com.byiryu.daggertest.di.ApplicationModule
import com.byiryu.daggertest.di.DaggerAppComponent
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject


class myApp : Application(), HasAndroidInjector{


    @Inject
    lateinit var activitydisaptching : DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> {
       return activitydisaptching
    }

    lateinit var component : AppComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.builder()
            .application(this)
            .build()

        component.inject(this)
    }

}

val Activity.component get() = (application as myApp).component