package com.byiryu.daggertest.di

import com.byiryu.daggertest.ui.MainActivity
import com.byiryu.daggertest.ui.MainModule
import com.byiryu.daggertest.ui.SubActivity
import com.byiryu.daggertest.ui.SubModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder{
    @ContributesAndroidInjector( modules = [MainModule::class])
    abstract fun bindMainActivity() : MainActivity

    @ContributesAndroidInjector (modules =  [SubModule::class])
    abstract fun bindSubActivity() : SubActivity
}