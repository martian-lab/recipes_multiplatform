package com.martianlab.recipes.presentation.fragments.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010-\u001a\u00020.2\b\u0010!\u001a\u0004\u0018\u00010 H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020.2\u0006\u00102\u001a\u000203H\u0000\u00a2\u0006\u0002\b4J\u0006\u00105\u001a\u00020.R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\tR/\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001f\u001a\u0004\u0018\u00010 8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b&\u0010\'\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001d\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00110\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\tR\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00066"}, d2 = {"Lcom/martianlab/recipes/presentation/fragments/details/DetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "Lorg/koin/core/KoinComponent;", "()V", "complexity", "Landroidx/databinding/ObservableField;", "", "getComplexity", "()Landroidx/databinding/ObservableField;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "imageURL", "getImageURL", "ingredientsList", "", "Lcom/martianlab/recipes/entities/RecipeIngredient;", "getIngredientsList", "interactor", "Lcom/martianlab/recipes/domain/RecipesInteractor;", "getInteractor", "()Lcom/martianlab/recipes/domain/RecipesInteractor;", "interactor$delegate", "Lkotlin/Lazy;", "isLoading", "Landroidx/databinding/ObservableBoolean;", "()Landroidx/databinding/ObservableBoolean;", "personsText", "getPersonsText", "<set-?>", "", "recipeId", "getRecipeId", "()Ljava/lang/Long;", "setRecipeId", "(Ljava/lang/Long;)V", "recipeId$delegate", "Lkotlin/properties/ReadWriteProperty;", "stagesList", "Lcom/martianlab/recipes/entities/RecipeStage;", "getStagesList", "title", "getTitle", "getReceipt", "", "getReceipt$androidApp_debug", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadDetailsToView", "recipe", "Lcom/martianlab/recipes/entities/Recipe;", "loadDetailsToView$androidApp_debug", "onBackPressed", "androidApp_debug"})
public final class DetailsViewModel extends androidx.lifecycle.ViewModel implements kotlinx.coroutines.CoroutineScope, org.koin.core.KoinComponent {
    private final kotlin.Lazy interactor$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.properties.ReadWriteProperty recipeId$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.util.List<com.martianlab.recipes.entities.RecipeStage>> stagesList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.util.List<com.martianlab.recipes.entities.RecipeIngredient>> ingredientsList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> personsText = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> complexity = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> title = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> imageURL = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableBoolean isLoading = null;
    
    private final com.martianlab.recipes.domain.RecipesInteractor getInteractor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getRecipeId() {
        return null;
    }
    
    public final void setRecipeId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.util.List<com.martianlab.recipes.entities.RecipeStage>> getStagesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.util.List<com.martianlab.recipes.entities.RecipeIngredient>> getIngredientsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getPersonsText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getComplexity() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getReceipt$androidApp_debug(@org.jetbrains.annotations.Nullable()
    java.lang.Long recipeId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public final void loadDetailsToView$androidApp_debug(@org.jetbrains.annotations.NotNull()
    com.martianlab.recipes.entities.Recipe recipe) {
    }
    
    public final void onBackPressed() {
    }
    
    public DetailsViewModel() {
        super();
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