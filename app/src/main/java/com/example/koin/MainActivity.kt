package com.example.koin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val honeyLemonade by inject<HoneyLemonade>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val honeyLemonade2 = get<HoneyLemonade>()
        val honeyLemonade3: HoneyLemonade = get()
    }
}