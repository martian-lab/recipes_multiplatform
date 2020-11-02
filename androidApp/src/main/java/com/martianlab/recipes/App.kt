package com.martianlab.recipes

import android.app.Application
import android.content.Context
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import com.martianlab.data.sources.db_new.appContext
import com.martianlab.recipes.di.*
import com.surrus.common.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import java.lang.ref.WeakReference

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        appContext = this

        initKoin {
            androidLogger()
            androidContext(this@App)
            modules(appModule, dataModule, domainModule, )
        }
    }

    companion object {
        lateinit var context: Context
        var fragmentManager : WeakReference<FragmentManager>? = null
        var fragmentActivity : WeakReference<FragmentActivity>? = null
    }
}