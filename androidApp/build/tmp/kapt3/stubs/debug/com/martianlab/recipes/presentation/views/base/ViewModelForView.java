package com.martianlab.recipes.presentation.views.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/martianlab/recipes/presentation/views/base/ViewModelForView;", "", "onCleared", "", "onViewAttachedToWindow", "onViewDetachedFromWindow", "androidApp_debug"})
public abstract interface ViewModelForView {
    
    public abstract void onViewAttachedToWindow();
    
    public abstract void onViewDetachedFromWindow();
    
    public abstract void onCleared();
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        public static void onViewAttachedToWindow(@org.jetbrains.annotations.NotNull()
        com.martianlab.recipes.presentation.views.base.ViewModelForView $this) {
        }
        
        public static void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
        com.martianlab.recipes.presentation.views.base.ViewModelForView $this) {
        }
        
        public static void onCleared(@org.jetbrains.annotations.NotNull()
        com.martianlab.recipes.presentation.views.base.ViewModelForView $this) {
        }
    }
}