package com.byiryu.daggertest.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.byiryu.daggertest.di.DaggerViewModelFactory
import com.byiryu.daggertest.di.ViewModelKey
import com.squareup.inject.assisted.AssistedInject
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class SubModule {


//    @Binds
//    @IntoMap
//    @ViewModelKey(SubViewModel::class)
//    abstract fun bindSubViewModel(viewmodel: SubViewModel): ViewModel

//    @Binds
//    @IntoMap
//    @ViewModelKey(SubViewModel::class)
//    abstract fun bindSubViewModel(factory : SubViewModel.Factory):
//
//    @Binds
//    abstract fun bindSubFactory(factory : SubViewModel.Factory) : ViewModelProvider.Factory

}