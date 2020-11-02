package com.martianlab.recipes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/martianlab/recipes/App;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "androidApp_debug"})
public final class App extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public static android.content.Context context;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManager;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.ref.WeakReference<androidx.fragment.app.FragmentActivity> fragmentActivity;
    public static final com.martianlab.recipes.App.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public App() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lcom/martianlab/recipes/App$Companion;", "", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "fragmentActivity", "Ljava/lang/ref/WeakReference;", "Landroidx/fragment/app/FragmentActivity;", "getFragmentActivity", "()Ljava/lang/ref/WeakReference;", "setFragmentActivity", "(Ljava/lang/ref/WeakReference;)V", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "getFragmentManager", "setFragmentManager", "androidApp_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        public final void setContext(@org.jetbrains.annotations.NotNull()
        android.content.Context p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> getFragmentManager() {
            return null;
        }
        
        public final void setFragmentManager(@org.jetbrains.annotations.Nullable()
        java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.ref.WeakReference<androidx.fragment.app.FragmentActivity> getFragmentActivity() {
            return null;
        }
        
        public final void setFragmentActivity(@org.jetbrains.annotations.Nullable()
        java.lang.ref.WeakReference<androidx.fragment.app.FragmentActivity> p0) {
        }
        
        private Companion() {
            super();
        }
    }
}