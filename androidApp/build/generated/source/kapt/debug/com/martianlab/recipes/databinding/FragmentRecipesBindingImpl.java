package com.martianlab.recipes.databinding;
import com.martianlab.recipes.R;
import com.martianlab.recipes.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRecipesBindingImpl extends FragmentRecipesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRecipesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentRecipesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (android.widget.ProgressBar) bindings[2]
            , (com.martianlab.recipes.presentation.views.base.BaseRecyclerView) bindings[1]
            );
        this.coordinatorMainLayout.setTag(null);
        this.progressBar.setTag(null);
        this.recyclerView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.martianlab.recipes.presentation.fragments.mainPage.MainPageViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.martianlab.recipes.presentation.fragments.mainPage.MainPageViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsLoading((androidx.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelCategoryList((androidx.databinding.ObservableField<java.util.List<com.martianlab.recipes.entities.Category>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsLoading(androidx.databinding.ObservableBoolean ViewModelIsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCategoryList(androidx.databinding.ObservableField<java.util.List<com.martianlab.recipes.entities.Category>> ViewModelCategoryList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.util.List<com.martianlab.recipes.entities.Category> viewModelCategoryListGet = null;
        androidx.databinding.ObservableBoolean viewModelIsLoading = null;
        boolean viewModelIsLoadingGet = false;
        com.martianlab.recipes.presentation.fragments.mainPage.MainPageViewModel viewModel = mViewModel;
        androidx.databinding.ObservableField<java.util.List<com.martianlab.recipes.entities.Category>> viewModelCategoryList = null;
        boolean ViewModelIsLoading1 = false;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoading
                        viewModelIsLoading = viewModel.isLoading();
                    }
                    updateRegistration(0, viewModelIsLoading);


                    if (viewModelIsLoading != null) {
                        // read viewModel.isLoading.get()
                        viewModelIsLoadingGet = viewModelIsLoading.get();
                    }


                    // read !viewModel.isLoading.get()
                    ViewModelIsLoading1 = !viewModelIsLoadingGet;
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.categoryList
                        viewModelCategoryList = viewModel.getCategoryList();
                    }
                    updateRegistration(1, viewModelCategoryList);


                    if (viewModelCategoryList != null) {
                        // read viewModel.categoryList.get()
                        viewModelCategoryListGet = viewModelCategoryList.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.martianlab.recipes.presentation.binding.BindingAdapters.showHide(this.progressBar, ViewModelIsLoading1);
            com.martianlab.recipes.presentation.binding.BindingAdapters.showHide(this.recyclerView, viewModelIsLoadingGet);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.martianlab.recipes.presentation.views.base.BaseRecyclerView.setData(this.recyclerView, viewModelCategoryListGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isLoading
        flag 1 (0x2L): viewModel.categoryList
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}