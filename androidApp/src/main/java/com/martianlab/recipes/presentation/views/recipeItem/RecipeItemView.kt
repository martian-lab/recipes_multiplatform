package com.martianlab.recipes.presentation.views.recipeItem

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import com.martianlab.recipes.databinding.RecipeItemBinding
import com.martianlab.recipes.entities.Recipe
import com.martianlab.recipes.presentation.views.base.RecyclerItemView


class RecipeItemView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle), RecyclerItemView<Recipe> {

    override val viewModel = RecipeItemViewModel()

    override val binding: RecipeItemBinding = RecipeItemBinding.inflate(activity.layoutInflater, this, true)
            .apply { viewModel = this@RecipeItemView.viewModel }

    override fun bindData(data: Recipe) {
        viewModel.bindData(data)
    }


}

