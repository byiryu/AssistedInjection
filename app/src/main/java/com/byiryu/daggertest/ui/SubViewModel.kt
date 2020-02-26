package com.byiryu.daggertest.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import com.byiryu.daggertest.api.ApiService
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject
import javax.inject.Inject

class SubViewModel @AssistedInject constructor(
    @Assisted val name : String) : ViewModel(){

    @AssistedInject.Factory
    interface Factory{
        fun create(name : String) : SubViewModel
    }

    init {
        load()
    }

    fun load(){
        Log.e("Tag", name)
    }

}