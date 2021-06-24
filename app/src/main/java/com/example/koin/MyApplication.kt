package com.example.koin

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApplication)
            modules(myModule)
        }
    }
}

val myModule = module {
    factory { HoneyLemonade(get(), get()) }
    factory { Honey(get()) }
    factory { Lemon() }
    single { Bee() }
    viewModel { MainViewModel(get()) }
}