package com.martianlab.recipes.presentation.views.stage

import androidx.databinding.ObservableField
import com.martianlab.recipes.entities.RecipeStage
import com.martianlab.recipes.presentation.views.base.ViewModelForView


class StageItemViewModel internal constructor() : ViewModelForView {

    private lateinit var item : RecipeStage

    val text = ObservableField<String>()
    val imageURL = ObservableField<String>()
    val step = ObservableField<String>()


    fun bindData(data: RecipeStage){
        item = data
        text.set(item.text)
        imageURL.set(item.imageURL)
        step.set(item.step.toString())
    }

}
