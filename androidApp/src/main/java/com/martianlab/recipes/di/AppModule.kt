package com.martianlab.recipes.di

import android.content.Context
import com.martianlab.recipes.App
import com.martianlab.recipes.data.sources.db_new.DatabaseDriverFactory
import com.martianlab.recipes.domain.RecipesInteractor
import com.martianlab.recipes.RecipesSDK
import com.martianlab.recipes.domain.api.RoutingApi
import com.martianlab.recipes.routing.RouterImpl
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val appModule = module {
    single { provideRouting() }
    single { provideDatabaseDriverFactory(androidContext()) }
    single { provideRecipesInteractor(get(), get()) }
}

private fun provideRouting() : RoutingApi {
    val fragmentManager = App.fragmentManager?.get()
    return RouterImpl(fragmentManager)
}

private fun provideDatabaseDriverFactory(context: Context) =
    DatabaseDriverFactory(context)


private fun provideRecipesInteractor(driverFactory: DatabaseDriverFactory, routing: RoutingApi) : RecipesInteractor
    = RecipesSDK(driverFactory, routing).interactor
