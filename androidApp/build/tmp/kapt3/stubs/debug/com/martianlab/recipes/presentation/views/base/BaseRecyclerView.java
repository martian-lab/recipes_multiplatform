package com.martianlab.recipes.presentation.views.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00043456B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0006\u00100\u001a\u000201J\u0016\u00102\u001a\u0002012\u000e\u0010-\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030.R*\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b@FX\u0086\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R0\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R@\u0010\u001a\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0019\u0018\u00010\u00182\u0014\u0010\n\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0019\u0018\u00010\u0018@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010!\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b@FX\u0086\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010\r\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011R\u000e\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010(\u001a\u0004\u0018\u00010\'2\b\u0010\n\u001a\u0004\u0018\u00010\'@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0018\u00010.X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/martianlab/recipes/presentation/views/base/BaseRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/martianlab/recipes/presentation/views/base/IBaseView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "behaviour", "getBehaviour$annotations", "()V", "getBehaviour", "()I", "setBehaviour", "(I)V", "", "data", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "Lkotlin/reflect/KClass;", "Lcom/martianlab/recipes/presentation/views/base/RecyclerItemView;", "itemViewClass", "getItemViewClass", "()Lkotlin/reflect/KClass;", "setItemViewClass", "(Lkotlin/reflect/KClass;)V", "linearSnapHelper", "Landroidx/recyclerview/widget/LinearSnapHelper;", "orientation", "getOrientation$annotations", "getOrientation", "setOrientation", "pagerSnapHelper", "Landroidx/recyclerview/widget/PagerSnapHelper;", "Lcom/martianlab/recipes/presentation/views/base/ViewModelForView;", "parentViewModel", "getParentViewModel", "()Lcom/martianlab/recipes/presentation/views/base/ViewModelForView;", "setParentViewModel", "(Lcom/martianlab/recipes/presentation/views/base/ViewModelForView;)V", "primaryDataProperty", "Lkotlin/reflect/KProperty1;", "", "disableDiffUtils", "", "enableDiffUtils", "Adapter", "Behaviour", "Companion", "DiffUtilCallback", "androidApp_debug"})
public class BaseRecyclerView extends androidx.recyclerview.widget.RecyclerView implements com.martianlab.recipes.presentation.views.base.IBaseView {
    private int orientation = androidx.recyclerview.widget.RecyclerView.VERTICAL;
    private final androidx.recyclerview.widget.PagerSnapHelper pagerSnapHelper = null;
    private final androidx.recyclerview.widget.LinearSnapHelper linearSnapHelper = null;
    private int behaviour = 0;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<?> data;
    @org.jetbrains.annotations.Nullable()
    private kotlin.reflect.KClass<? extends com.martianlab.recipes.presentation.views.base.RecyclerItemView<?>> itemViewClass;
    @org.jetbrains.annotations.Nullable()
    private com.martianlab.recipes.presentation.views.base.ViewModelForView parentViewModel;
    private kotlin.reflect.KProperty1<java.lang.Object, ? extends java.lang.Object> primaryDataProperty;
    public static final int SCROLL = 0;
    public static final int CENTRING_SCROLL = 1;
    public static final int SWIPE = 2;
    public static final com.martianlab.recipes.presentation.views.base.BaseRecyclerView.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @androidx.recyclerview.widget.RecyclerView.Orientation()
    @java.lang.Deprecated()
    public static void getOrientation$annotations() {
    }
    
    public final int getOrientation() {
        return 0;
    }
    
    public final void setOrientation(int value) {
    }
    
    @com.martianlab.recipes.presentation.views.base.BaseRecyclerView.Behaviour()
    @java.lang.Deprecated()
    public static void getBehaviour$annotations() {
    }
    
    public final int getBehaviour() {
        return 0;
    }
    
    public final void setBehaviour(int value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<?> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<?> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.reflect.KClass<? extends com.martianlab.recipes.presentation.views.base.RecyclerItemView<?>> getItemViewClass() {
        return null;
    }
    
    public final void setItemViewClass(@org.jetbrains.annotations.Nullable()
    kotlin.reflect.KClass<? extends com.martianlab.recipes.presentation.views.base.RecyclerItemView<?>> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.martianlab.recipes.presentation.views.base.ViewModelForView getParentViewModel() {
        return null;
    }
    
    public final void setParentViewModel(@org.jetbrains.annotations.Nullable()
    com.martianlab.recipes.presentation.views.base.ViewModelForView value) {
    }
    
    /**
     * Включает `DiffUtils` для этого `RecyclerView`.
     * @param primaryDataProperty - свойство класса данных, переданных через датабиндинг для
     * отображения. Сравнивая это свойствоу старых и новых данных, `DiffUtils` понимает, какой
     * яцейке в `RecyclerView` соответствуют новые данные.
     */
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    public final void enableDiffUtils(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty1<?, ?> primaryDataProperty) {
    }
    
    public final void disableDiffUtils() {
    }
    
    public BaseRecyclerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    public BaseRecyclerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public BaseRecyclerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public com.martianlab.recipes.presentation.views.base.ViewModelForView getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.fragment.app.FragmentActivity getActivity() {
        return null;
    }
    
    @androidx.databinding.BindingAdapter(value = {"data"})
    public static final void setData(@org.jetbrains.annotations.NotNull()
    com.martianlab.recipes.presentation.views.base.BaseRecyclerView view, @org.jetbrains.annotations.Nullable()
    java.util.List<?> value) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"viewModel"})
    public static final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.martianlab.recipes.presentation.views.base.BaseRecyclerView view, @org.jetbrains.annotations.Nullable()
    com.martianlab.recipes.presentation.views.base.ViewModelForView value) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B1\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/martianlab/recipes/presentation/views/base/BaseRecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/martianlab/recipes/presentation/views/base/BaseRecyclerView$Adapter$ViewHolder;", "data", "", "itemViewClass", "Lkotlin/reflect/KClass;", "Lcom/martianlab/recipes/presentation/views/base/RecyclerItemView;", "parentViewModel", "Lcom/martianlab/recipes/presentation/views/base/ViewModelForView;", "(Ljava/util/List;Lkotlin/reflect/KClass;Lcom/martianlab/recipes/presentation/views/base/ViewModelForView;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "androidApp_debug"})
    public static final class Adapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.martianlab.recipes.presentation.views.base.BaseRecyclerView.Adapter.ViewHolder> {
        @org.jetbrains.annotations.NotNull()
        private java.util.List<?> data;
        private final kotlin.reflect.KClass<? extends com.martianlab.recipes.presentation.views.base.RecyclerItemView<?>> itemViewClass = null;
        private final com.martianlab.recipes.presentation.views.base.ViewModelForView parentViewModel = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.martianlab.recipes.presentation.views.base.BaseRecyclerView.Adapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        com.martianlab.recipes.presentation.views.base.BaseRecyclerView.Adapter.ViewHolder holder, int position) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<?> getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.NotNull()
        java.util.List<?> p0) {
        }
        
        public Adapter(@org.jetbrains.annotations.NotNull()
        java.util.List<?> data, @org.jetbrains.annotations.NotNull()
        kotlin.reflect.KClass<? extends com.martianlab.recipes.presentation.views.base.RecyclerItemView<?>> itemViewClass, @org.jetbrains.annotations.Nullable()
        com.martianlab.recipes.presentation.views.base.ViewModelForView parentViewModel) {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u00a2\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/martianlab/recipes/presentation/views/base/BaseRecyclerView$Adapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "iItemView", "Lcom/martianlab/recipes/presentation/views/base/RecyclerItemView;", "(Lcom/martianlab/recipes/presentation/views/base/RecyclerItemView;)V", "getIItemView", "()Lcom/martianlab/recipes/presentation/views/base/RecyclerItemView;", "androidApp_debug"})
        public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private final com.martianlab.recipes.presentation.views.base.RecyclerItemView<?> iItemView = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.martianlab.recipes.presentation.views.base.RecyclerItemView<?> getIItemView() {
                return null;
            }
            
            public ViewHolder(@org.jetbrains.annotations.NotNull()
            com.martianlab.recipes.presentation.views.base.RecyclerItemView<?> iItemView) {
                super(null);
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016R\u0012\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/martianlab/recipes/presentation/views/base/BaseRecyclerView$DiffUtilCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "primaryDataProperty", "Lkotlin/reflect/KProperty1;", "", "oldData", "", "newData", "(Lkotlin/reflect/KProperty1;Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "androidApp_debug"})
    static final class DiffUtilCallback extends androidx.recyclerview.widget.DiffUtil.Callback {
        private final kotlin.reflect.KProperty1<java.lang.Object, java.lang.Object> primaryDataProperty = null;
        private final java.util.List<?> oldData = null;
        private final java.util.List<?> newData = null;
        
        @java.lang.Override()
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
        
        @java.lang.Override()
        public int getOldListSize() {
            return 0;
        }
        
        @java.lang.Override()
        public int getNewListSize() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
        
        public DiffUtilCallback(@org.jetbrains.annotations.NotNull()
        kotlin.reflect.KProperty1<java.lang.Object, ? extends java.lang.Object> primaryDataProperty, @org.jetbrains.annotations.NotNull()
        java.util.List<?> oldData, @org.jetbrains.annotations.NotNull()
        java.util.List<?> newData) {
            super();
        }
    }
    
    @androidx.annotation.IntDef(value = {0, 1, 2})
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/martianlab/recipes/presentation/views/base/BaseRecyclerView$Behaviour;", "", "androidApp_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    public static abstract @interface Behaviour {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fH\u0007J\u001a\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/martianlab/recipes/presentation/views/base/BaseRecyclerView$Companion;", "", "()V", "CENTRING_SCROLL", "", "SCROLL", "SWIPE", "setData", "", "view", "Lcom/martianlab/recipes/presentation/views/base/BaseRecyclerView;", "value", "", "setViewModel", "Lcom/martianlab/recipes/presentation/views/base/ViewModelForView;", "androidApp_debug"})
    public static final class Companion {
        
        @androidx.databinding.BindingAdapter(value = {"data"})
        public final void setData(@org.jetbrains.annotations.NotNull()
        com.martianlab.recipes.presentation.views.base.BaseRecyclerView view, @org.jetbrains.annotations.Nullable()
        java.util.List<?> value) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"viewModel"})
        public final void setViewModel(@org.jetbrains.annotations.NotNull()
        com.martianlab.recipes.presentation.views.base.BaseRecyclerView view, @org.jetbrains.annotations.Nullable()
        com.martianlab.recipes.presentation.views.base.ViewModelForView value) {
        }
        
        private Companion() {
            super();
        }
    }
}