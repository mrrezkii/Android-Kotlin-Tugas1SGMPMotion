package com.motionlaboratory.tugas_1_sg_mp_android_2

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }
}