package com.martianlab.recipes.di


import com.martianlab.recipes.domain.RecipesInteractor
import com.martianlab.recipes.domain.RecipesInteractorImpl
import com.martianlab.recipes.domain.RecipesRepository
import com.martianlab.recipes.domain.api.BackendApi
import com.martianlab.recipes.domain.api.DbApi
import com.martianlab.recipes.domain.api.RoutingApi
import org.koin.dsl.module

val domainModule = module {
    single { provideInteractor(get(), get(), get(), get()) }
}

private fun provideInteractor(repo: RecipesRepository, backendApi: BackendApi, dbApi: DbApi, router: RoutingApi) : RecipesInteractor =
    RecipesInteractorImpl(repo, dbApi, backendApi, router)

