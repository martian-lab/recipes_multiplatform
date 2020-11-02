package com.martianlab.recipes.presentation.views.recipeCategory

import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import com.martianlab.recipes.App
import com.martianlab.recipes.domain.RecipesInteractor
import com.martianlab.recipes.entities.Category
import com.martianlab.recipes.entities.Recipe
import com.martianlab.recipes.presentation.views.base.ViewModelForView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class RecipeCategoryItemViewModel internal constructor(

) : ViewModelForView, CoroutineScope by CoroutineScope(Dispatchers.IO), KoinComponent {

    private val interactor: RecipesInteractor by inject()

    private lateinit var item : Category

    val title = ObservableField<String>()
    val isChecked = ObservableBoolean()

    val recipeList = ObservableField<List<Recipe>>()

    fun bindData(data: Category){
        item = data
        title.set(item.title)
        launch {
            //interactor.loadToDb()
            recipeList.set(interactor.getRecipes(data).also { println("RECIPES::, data=" + it) })
        }
    }

}
