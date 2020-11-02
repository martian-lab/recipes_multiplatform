package com.martianlab.recipes.presentation.views.base

import androidx.fragment.app.FragmentActivity


interface IBaseView : IView {

    val viewModel: ViewModelForView? get() = null

    val activity: FragmentActivity get() = context as FragmentActivity

}