package com.martianlab.recipes.presentation.views.recipeCategory

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import android.widget.LinearLayout
import com.martianlab.recipes.R
import com.martianlab.recipes.databinding.RecipeCategoryItemBinding
import com.martianlab.recipes.databinding.RecipeItemBinding
import com.martianlab.recipes.entities.Category
import com.martianlab.recipes.entities.Recipe
import com.martianlab.recipes.presentation.views.base.BaseRecyclerView
import com.martianlab.recipes.presentation.views.base.RecyclerItemView
import com.martianlab.recipes.presentation.views.recipeItem.RecipeItemView


class RecipeCategoryItemView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle), RecyclerItemView<Category> {

    override val viewModel = RecipeCategoryItemViewModel()

    override val binding: RecipeCategoryItemBinding = RecipeCategoryItemBinding.inflate(activity.layoutInflater, this, true)
            .apply { viewModel = this@RecipeCategoryItemView.viewModel }
            .apply { receiptList.itemViewClass = RecipeItemView::class }

    override fun bindData(data: Category) {
        viewModel.bindData(data)
    }


}

