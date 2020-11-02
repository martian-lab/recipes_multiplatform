package com.martianlab.recipes.presentation.views.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/martianlab/recipes/presentation/views/base/IBaseView;", "Lcom/martianlab/recipes/presentation/views/base/IView;", "activity", "Landroidx/fragment/app/FragmentActivity;", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "viewModel", "Lcom/martianlab/recipes/presentation/views/base/ViewModelForView;", "getViewModel", "()Lcom/martianlab/recipes/presentation/views/base/ViewModelForView;", "androidApp_debug"})
public abstract interface IBaseView extends com.martianlab.recipes.presentation.views.base.IView {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.martianlab.recipes.presentation.views.base.ViewModelForView getViewModel();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.fragment.app.FragmentActivity getActivity();
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.Nullable()
        public static com.martianlab.recipes.presentation.views.base.ViewModelForView getViewModel(@org.jetbrains.annotations.NotNull()
        com.martianlab.recipes.presentation.views.base.IBaseView $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static androidx.fragment.app.FragmentActivity getActivity(@org.jetbrains.annotations.NotNull()
        com.martianlab.recipes.presentation.views.base.IBaseView $this) {
            return null;
        }
    }
}