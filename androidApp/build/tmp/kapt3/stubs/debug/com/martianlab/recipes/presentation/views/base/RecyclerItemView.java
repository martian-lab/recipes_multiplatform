package com.martianlab.recipes.presentation.views.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/martianlab/recipes/presentation/views/base/RecyclerItemView;", "D", "", "Lcom/martianlab/recipes/presentation/views/base/IBaseView;", "binding", "Landroidx/databinding/ViewDataBinding;", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "bindData", "", "data", "(Ljava/lang/Object;)V", "bindDataInternal", "viewModel", "Lcom/martianlab/recipes/presentation/views/base/ViewModelForView;", "(Ljava/lang/Object;Lcom/martianlab/recipes/presentation/views/base/ViewModelForView;)V", "setParentViewModel", "androidApp_debug"})
public abstract interface RecyclerItemView<D extends java.lang.Object> extends com.martianlab.recipes.presentation.views.base.IBaseView {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.databinding.ViewDataBinding getBinding();
    
    public abstract void bindDataInternal(@org.jetbrains.annotations.NotNull()
    D data, @org.jetbrains.annotations.Nullable()
    com.martianlab.recipes.presentation.views.base.ViewModelForView viewModel);
    
    public abstract void bindData(@org.jetbrains.annotations.NotNull()
    D data);
    
    public abstract void setParentViewModel(@org.jetbrains.annotations.NotNull()
    com.martianlab.recipes.presentation.views.base.ViewModelForView viewModel);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        public static <D extends java.lang.Object>void bindDataInternal(@org.jetbrains.annotations.NotNull()
        com.martianlab.recipes.presentation.views.base.RecyclerItemView<D> $this, @org.jetbrains.annotations.NotNull()
        D data, @org.jetbrains.annotations.Nullable()
        com.martianlab.recipes.presentation.views.base.ViewModelForView viewModel) {
        }
        
        public static <D extends java.lang.Object>void setParentViewModel(@org.jetbrains.annotations.NotNull()
        com.martianlab.recipes.presentation.views.base.RecyclerItemView<D> $this, @org.jetbrains.annotations.NotNull()
        com.martianlab.recipes.presentation.views.base.ViewModelForView viewModel) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public static <D extends java.lang.Object>com.martianlab.recipes.presentation.views.base.ViewModelForView getViewModel(@org.jetbrains.annotations.NotNull()
        com.martianlab.recipes.presentation.views.base.RecyclerItemView<D> $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <D extends java.lang.Object>androidx.fragment.app.FragmentActivity getActivity(@org.jetbrains.annotations.NotNull()
        com.martianlab.recipes.presentation.views.base.RecyclerItemView<D> $this) {
            return null;
        }
    }
}