package com.martianlab.recipes.di

import com.martianlab.data.repository.RecipesRepositoryImpl
import com.martianlab.data.sources.backend.BackendKtorImpl
import com.martianlab.data.sources.db_new.DatabaseDriverFactory
import com.martianlab.recipes.domain.RecipesRepository
import com.martianlab.recipes.domain.api.BackendApi
import com.martianlab.recipes.domain.api.DbApi
import com.martianlab.recipes.domain.api.RoutingApi
import org.koin.dsl.module

val dataModule = module {
    single { provideApiService() }
    single { provideDb() }
    single { provideRepository(get(), get()) }

}

private fun provideRepository(backendApi: BackendApi, dbApi: DbApi) : RecipesRepository =
    RecipesRepositoryImpl(dbApi, backendApi)

private fun provideApiService() : BackendApi
        = BackendKtorImpl()

private fun provideDb() : DbApi =
    DatabaseDriverFactory()
