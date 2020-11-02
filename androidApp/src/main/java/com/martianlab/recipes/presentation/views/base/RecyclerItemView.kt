package com.martianlab.recipes.presentation.views.base

import android.view.View
import androidx.databinding.ViewDataBinding

interface RecyclerItemView<D : Any> : IBaseView {

    val binding: ViewDataBinding

    fun bindDataInternal(data: D, viewModel: ViewModelForView?) {
        visibility = View.GONE
        bindData(data)
        viewModel?.let { setParentViewModel(it) }
        binding.executePendingBindings()
        visibility = View.VISIBLE
    }

    fun bindData(data: D)

    fun setParentViewModel(viewModel: ViewModelForView){}
}