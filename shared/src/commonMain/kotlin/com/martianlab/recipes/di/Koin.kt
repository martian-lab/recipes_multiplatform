package com.surrus.common.di

import com.martianlab.recipes.di.dataModule
import com.martianlab.recipes.di.domainModule
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

internal fun initKoin(appDeclaration: KoinAppDeclaration = {}) = startKoin {
    appDeclaration()
    modules(dataModule, domainModule)
}

// called by iOS etc
fun initKoin() = initKoin{}

