package com.martianlab.recipes.presentation.fragments.mainPage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.martianlab.recipes.databinding.FragmentRecipesBinding
import com.martianlab.recipes.presentation.fragments.details.DetailsViewModel
import com.martianlab.recipes.presentation.views.recipeCategory.RecipeCategoryItemView

class MainPageFragment : Fragment() {


    lateinit var binding: FragmentRecipesBinding

    val viewModel : MainPageViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
        FragmentRecipesBinding.inflate(inflater)
            .apply { viewModel = this@MainPageFragment.viewModel }
            .apply { binding = this }
            .root

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        //(activity as BottomTabsActivity).hideBottomPanel()
//        //viewModel.doSmth()
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerView.itemViewClass = RecipeCategoryItemView::class
    }


}