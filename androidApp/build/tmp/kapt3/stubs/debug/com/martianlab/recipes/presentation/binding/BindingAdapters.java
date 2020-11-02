package com.martianlab.recipes.presentation.binding;

import java.lang.System;

/**
 * Data Binding adapters specific to the app.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0007J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/martianlab/recipes/presentation/binding/BindingAdapters;", "", "()V", "loadImage", "", "view", "Landroid/view/View;", "url", "", "onNavigationClick", "Landroidx/appcompat/widget/Toolbar;", "onClick", "Lkotlin/Function0;", "showHide", "show", "", "androidApp_debug"})
public final class BindingAdapters {
    public static final com.martianlab.recipes.presentation.binding.BindingAdapters INSTANCE = null;
    
    @androidx.databinding.BindingAdapter(value = {"visibleGone"})
    public static final void showHide(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean show) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageUrl"})
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"onNavigationClick"})
    public static final void onNavigationClick(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar view, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    private BindingAdapters() {
        super();
    }
}