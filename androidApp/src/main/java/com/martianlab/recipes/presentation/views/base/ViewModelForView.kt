package com.martianlab.recipes.presentation.views.base


interface ViewModelForView  {

    open fun onViewAttachedToWindow() = Unit

    open fun onViewDetachedFromWindow() = Unit

    fun onCleared() {
    }
}