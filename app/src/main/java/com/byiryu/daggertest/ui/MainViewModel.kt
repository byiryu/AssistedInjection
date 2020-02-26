package com.byiryu.daggertest.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.byiryu.daggertest.api.ApiService
import com.byiryu.daggertest.data.Contents
import javax.inject.Inject

class MainViewModel @Inject constructor(var apiService: ApiService) : ViewModel(){

    val content = MutableLiveData<Contents>()

    var a : String ? = null
        set(value){
            if(field == null){
                field = value
                load()
            }
        }


    init {
        Log.e("t","adfasf")
    }

    fun load(){


    }
}