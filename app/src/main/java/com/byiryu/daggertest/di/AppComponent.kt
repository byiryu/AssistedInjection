package com.byiryu.daggertest.di

import android.app.Application
import com.byiryu.daggertest.myApp
import com.byiryu.daggertest.ui.SubViewModel
import com.squareup.inject.assisted.dagger2.AssistedModule
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [

    (AndroidInjectionModule::class),
    (ApplicationModule::class),
    (ActivityBuilder::class),
    (ContextModule::class),
    (DaggerViewModelFactoryModule::class),
    (AssistedInjectModule::class)

        ])
interface AppComponent{

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }



    fun inject(app: myApp)

    val subFactory : SubViewModel.Factory
}
@AssistedModule
@Module(includes = [AssistedInject_AssistedInjectModule::class])
interface AssistedInjectModule