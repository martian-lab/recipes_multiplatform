package com.martianlab.recipes.presentation.views.stage

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import com.martianlab.recipes.databinding.RecipeItemBinding
import com.martianlab.recipes.databinding.RecipeStageItemBinding
import com.martianlab.recipes.entities.Recipe
import com.martianlab.recipes.entities.RecipeStage
import com.martianlab.recipes.presentation.views.base.RecyclerItemView


class StageItemView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle), RecyclerItemView<RecipeStage> {

    override val viewModel = StageItemViewModel()

    override val binding: RecipeStageItemBinding = RecipeStageItemBinding.inflate(activity.layoutInflater, this, true)
            .apply { viewModel = this@StageItemView.viewModel }

    override fun bindData(data: RecipeStage) {
        viewModel.bindData(data)
    }


}

