package com.martianlab.recipes.presentation.views.ingredient

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import com.martianlab.recipes.databinding.RecipeIngredientItemBinding
import com.martianlab.recipes.databinding.RecipeItemBinding
import com.martianlab.recipes.entities.Recipe
import com.martianlab.recipes.entities.RecipeIngredient
import com.martianlab.recipes.presentation.views.base.RecyclerItemView


class IngredientItemView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle), RecyclerItemView<RecipeIngredient> {

    override val viewModel = IngredientItemViewModel()

    override val binding: RecipeIngredientItemBinding = RecipeIngredientItemBinding.inflate(activity.layoutInflater, this, true)
            .apply { viewModel = this@IngredientItemView.viewModel }

    override fun bindData(data: RecipeIngredient) {
        viewModel.bindData(data)
    }


}

