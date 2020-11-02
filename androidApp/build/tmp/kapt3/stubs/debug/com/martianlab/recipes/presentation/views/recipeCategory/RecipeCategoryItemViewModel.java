package com.martianlab.recipes.presentation.views.recipeCategory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007\b\u0000\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013R\u0012\u0010\u0005\u001a\u00020\u0006X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019\u00a8\u0006 "}, d2 = {"Lcom/martianlab/recipes/presentation/views/recipeCategory/RecipeCategoryItemViewModel;", "Lcom/martianlab/recipes/presentation/views/base/ViewModelForView;", "Lkotlinx/coroutines/CoroutineScope;", "Lorg/koin/core/KoinComponent;", "()V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "interactor", "Lcom/martianlab/recipes/domain/RecipesInteractor;", "getInteractor", "()Lcom/martianlab/recipes/domain/RecipesInteractor;", "interactor$delegate", "Lkotlin/Lazy;", "isChecked", "Landroidx/databinding/ObservableBoolean;", "()Landroidx/databinding/ObservableBoolean;", "item", "Lcom/martianlab/recipes/entities/Category;", "recipeList", "Landroidx/databinding/ObservableField;", "", "Lcom/martianlab/recipes/entities/Recipe;", "getRecipeList", "()Landroidx/databinding/ObservableField;", "title", "", "getTitle", "bindData", "", "data", "androidApp_debug"})
public final class RecipeCategoryItemViewModel implements com.martianlab.recipes.presentation.views.base.ViewModelForView, kotlinx.coroutines.CoroutineScope, org.koin.core.KoinComponent {
    private final kotlin.Lazy interactor$delegate = null;
    private com.martianlab.recipes.entities.Category item;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> title = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableBoolean isChecked = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.util.List<com.martianlab.recipes.entities.Recipe>> recipeList = null;
    
    private final com.martianlab.recipes.domain.RecipesInteractor getInteractor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isChecked() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.util.List<com.martianlab.recipes.entities.Recipe>> getRecipeList() {
        return null;
    }
    
    public final void bindData(@org.jetbrains.annotations.NotNull()
    com.martianlab.recipes.entities.Category data) {
    }
    
    public RecipeCategoryItemViewModel() {
        super();
    }
    
    public void onViewAttachedToWindow() {
    }
    
    public void onViewDetachedFromWindow() {
    }
    
    public void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
}