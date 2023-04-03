package com.jeff_skillrill.fragments_task

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.annotation.RequiresApi
import com.jeff_skillrill.fragments_task.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val splashfragment =supportFragmentManager.beginTransaction()
        splashfragment.add(R.id.nav_container, splash_screen())
        splashfragment.commit()

        Handler(Looper.getMainLooper()).postDelayed(
            {
                val insertfragment = supportFragmentManager.beginTransaction()
                insertfragment.replace(R.id.nav_container, fragment_start())
                insertfragment.commit()
            },3000
        )

    }
}