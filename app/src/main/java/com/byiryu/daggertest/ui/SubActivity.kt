package com.byiryu.daggertest.ui

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.byiryu.daggertest.component
import com.byiryu.daggertest.databinding.ActivitySubBinding
import com.byiryu.daggertest.di.viewModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject
import javax.inject.Provider

class SubActivity : DaggerAppCompatActivity(){

    @Inject
    lateinit var factory : SubViewModel.Factory

//    @Inject
//    lateinit var viewModelFactory: ViewModelProvider.Factory


//    lateinit var viewModel: SubViewModel


    private val subViewmodel by viewModel(this){
        component.subFactory.create(intent.getStringExtra("name"))
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



//        viewModel = factory.create("test")
//        viewModel = ViewModelProviders.of(this, viewModelFactory)[viewModelFactory(SubViewModel::class.java)]
        val viewModelBinding = ActivitySubBinding.inflate(layoutInflater).apply {
            vm = subViewmodel
        }

        setContentView(viewModelBinding.root)
    }


}