package com.martianlab.recipes.presentation.views.recipeItem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0000\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010J\u0006\u0010\u0016\u001a\u00020\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/martianlab/recipes/presentation/views/recipeItem/RecipeItemViewModel;", "Lcom/martianlab/recipes/presentation/views/base/ViewModelForView;", "Lorg/koin/core/KoinComponent;", "()V", "imageURL", "Landroidx/databinding/ObservableField;", "", "getImageURL", "()Landroidx/databinding/ObservableField;", "interactor", "Lcom/martianlab/recipes/domain/RecipesInteractor;", "getInteractor", "()Lcom/martianlab/recipes/domain/RecipesInteractor;", "interactor$delegate", "Lkotlin/Lazy;", "item", "Lcom/martianlab/recipes/entities/Recipe;", "title", "getTitle", "bindData", "", "data", "onClick", "androidApp_debug"})
public final class RecipeItemViewModel implements com.martianlab.recipes.presentation.views.base.ViewModelForView, org.koin.core.KoinComponent {
    private final kotlin.Lazy interactor$delegate = null;
    private com.martianlab.recipes.entities.Recipe item;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> title = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> imageURL = null;
    
    private final com.martianlab.recipes.domain.RecipesInteractor getInteractor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getImageURL() {
        return null;
    }
    
    public final void bindData(@org.jetbrains.annotations.NotNull()
    com.martianlab.recipes.entities.Recipe data) {
    }
    
    public final void onClick() {
    }
    
    public RecipeItemViewModel() {
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
}