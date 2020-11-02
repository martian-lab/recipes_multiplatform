package com.martianlab.recipes.domain.api


import android.util.DisplayMetrics
import com.martianlab.recipes.entities.DeviceType
import com.martianlab.recipes.entities.Theme
import kotlinx.coroutines.flow.Flow


interface AndroidSettingsApi {
    val androidId: String
    val deviceName: String
    val androidVersion: String
    val deviceType: DeviceType
    val displayMetrics: DisplayMetrics
    val systemTheme: Theme
}