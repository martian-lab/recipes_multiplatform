package com.martianlab.recipes.presentation.fragments.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.martianlab.recipes.databinding.FragmentRecipeDetailsBinding
import com.martianlab.recipes.presentation.views.ingredient.IngredientItemView
import com.martianlab.recipes.presentation.views.recipeCategory.RecipeCategoryItemView
import com.martianlab.recipes.presentation.views.stage.StageItemView
import kotlinx.android.synthetic.main.fragment_recipe_details.*

class DetailsFragment : Fragment() {

    val viewModel : DetailsViewModel by viewModels()

    lateinit var binding: FragmentRecipeDetailsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
        FragmentRecipeDetailsBinding.inflate(inflater)
            .apply { viewModel = this@DetailsFragment.viewModel }
            .apply { binding = this }
            .root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.recipeId = arguments?.getLong("recipeId")
        setInitialState()
    }

    private fun setInitialState(){
        with( binding) {
            ingredientsListView.itemViewClass = IngredientItemView::class
            ingredientsListView.visibility = View.VISIBLE
            stagesListView.itemViewClass = StageItemView::class
            stagesListView.visibility = View.GONE
            buttonIngrediends.isSelected = true
            buttonIngrediends.setOnClickListener { showIngredients() }
            buttonSteps.setOnClickListener { showSteps() }
        }
    }

    private fun showIngredients() {
        with( binding) {
            ingredientsListView.visibility = View.VISIBLE
            stagesListView.visibility = View.GONE
            appbar.setExpanded(false, true)
            buttonIngrediends.isSelected = true
            buttonSteps.isSelected = false
        }
    }

    private fun showSteps() {
        with( binding) {
            ingredientsListView.visibility = View.GONE
            stagesListView.visibility = View.VISIBLE
            appbar.setExpanded(false, true)
            buttonIngrediends.isSelected = false
            buttonSteps.isSelected = true
        }
    }



}