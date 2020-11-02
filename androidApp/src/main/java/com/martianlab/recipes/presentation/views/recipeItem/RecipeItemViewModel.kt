package com.martianlab.recipes.presentation.views.recipeItem

import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import com.martianlab.recipes.App
import com.martianlab.recipes.domain.RecipesInteractor
import com.martianlab.recipes.entities.Destination
import com.martianlab.recipes.entities.Recipe
import com.martianlab.recipes.presentation.views.base.ViewModelForView
import org.koin.core.KoinComponent
import org.koin.core.inject

class RecipeItemViewModel internal constructor() : ViewModelForView, KoinComponent {

    private val interactor: RecipesInteractor by inject()

    private lateinit var item : Recipe

    val title = ObservableField<String>()
    val imageURL = ObservableField<String>()


    fun bindData(data: Recipe){
        item = data
        title.set(item.title)
        imageURL.set(item.imageURL)
    }

    fun onClick(){
        interactor.goTo(Destination.RecipeDetails(item.id))
    }

}
