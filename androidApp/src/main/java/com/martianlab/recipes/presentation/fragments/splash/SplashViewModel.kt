package com.martianlab.recipes.presentation.fragments.splash

import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.martianlab.recipes.App
import com.martianlab.recipes.domain.RecipesInteractor
import com.martianlab.recipes.entities.Category
import com.martianlab.recipes.entities.Destination
import com.martianlab.recipes.entities.Recipe
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class SplashViewModel(
) : ViewModel(), CoroutineScope by CoroutineScope(Dispatchers.IO), KoinComponent {

    val interactor: RecipesInteractor by inject()

    val isLoading = ObservableBoolean(true)

    init {
        launch {
            interactor.firstLaunchCheck()
            interactor.goTo(Destination.MainPage)
        }
    }

}