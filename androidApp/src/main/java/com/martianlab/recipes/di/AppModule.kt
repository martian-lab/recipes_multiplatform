package com.martianlab.recipes.di

import android.content.Context
import com.martianlab.data.sources.backend.BackendKtorImpl
import com.martianlab.data.sources.db_new.DatabaseDriverFactory
import com.martianlab.recipes.App
import com.martianlab.recipes.domain.api.BackendApi
import com.martianlab.recipes.domain.api.DbApi
import com.martianlab.recipes.domain.api.RoutingApi
import com.martianlab.recipes.routing.RouterImpl
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val appModule = module {
    single { provideRouting() }
}

private fun provideRouting() : RoutingApi {
    val fragmentManager = App.fragmentManager?.get()
    val fragmentActivity = App.fragmentActivity
    return RouterImpl(fragmentActivity, fragmentManager)
}