package com.byiryu.daggertest.ui

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.byiryu.daggertest.R
import com.byiryu.daggertest.databinding.ActivityMainBinding
import dagger.android.DaggerActivity
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var viewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProviders.of(this@MainActivity, viewModelFactory)[MainViewModel::class.java]

        val viewModelBinding = ActivityMainBinding.inflate(layoutInflater).apply {
            vm = viewModel
        }

        setContentView(viewModelBinding.root)

        viewModelBinding.button.setOnClickListener {
            var intent = Intent(this@MainActivity, SubActivity::class.java)
            intent.putExtra("name", "name")
            startActivity(intent)
        }
    }



}
