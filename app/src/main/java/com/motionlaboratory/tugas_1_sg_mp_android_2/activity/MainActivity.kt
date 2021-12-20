package com.motionlaboratory.tugas_1_sg_mp_android_2.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.motionlaboratory.tugas_1_sg_mp_android_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(
            layoutInflater
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}