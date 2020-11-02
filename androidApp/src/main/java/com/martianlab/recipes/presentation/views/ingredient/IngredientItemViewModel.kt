package com.martianlab.recipes.presentation.views.ingredient

import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import com.martianlab.recipes.entities.Recipe
import com.martianlab.recipes.entities.RecipeIngredient
import com.martianlab.recipes.presentation.views.base.ViewModelForView


class IngredientItemViewModel internal constructor() : ViewModelForView {

    private lateinit var item : RecipeIngredient

    val title = ObservableField<String>()
    val value = ObservableField<String>()


    fun bindData(data: RecipeIngredient){
        item = data
        title.set(item.title)
        value.set(item.quantity + " " + item.measureUnit)
    }

}
