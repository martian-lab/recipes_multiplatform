package com.martianlab.recipes.routing;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lcom/martianlab/recipes/routing/RouterImpl;", "Lcom/martianlab/recipes/domain/api/RoutingApi;", "activity", "Ljava/lang/ref/WeakReference;", "Landroidx/fragment/app/FragmentActivity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Ljava/lang/ref/WeakReference;Landroidx/fragment/app/FragmentManager;)V", "getActivity", "()Ljava/lang/ref/WeakReference;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "goBack", "", "goTo", "destination", "Lcom/martianlab/recipes/entities/Destination;", "androidApp_debug"})
public final class RouterImpl implements com.martianlab.recipes.domain.api.RoutingApi {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentActivity> activity = null;
    @org.jetbrains.annotations.Nullable()
    private final androidx.fragment.app.FragmentManager fragmentManager = null;
    
    @java.lang.Override()
    public void goTo(@org.jetbrains.annotations.NotNull()
    com.martianlab.recipes.entities.Destination destination) {
    }
    
    @java.lang.Override()
    public void goBack() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.ref.WeakReference<androidx.fragment.app.FragmentActivity> getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.fragment.app.FragmentManager getFragmentManager() {
        return null;
    }
    
    public RouterImpl(@org.jetbrains.annotations.Nullable()
    java.lang.ref.WeakReference<androidx.fragment.app.FragmentActivity> activity, @org.jetbrains.annotations.Nullable()
    androidx.fragment.app.FragmentManager fragmentManager) {
        super();
    }
}