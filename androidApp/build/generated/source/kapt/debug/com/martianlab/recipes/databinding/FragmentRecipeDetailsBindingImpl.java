package com.martianlab.recipes.databinding;
import com.martianlab.recipes.R;
import com.martianlab.recipes.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRecipeDetailsBindingImpl extends FragmentRecipeDetailsBinding implements com.martianlab.recipes.generated.callback.Function0.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 9);
        sViewsWithIds.put(R.id.collapsing_toolbar, 10);
        sViewsWithIds.put(R.id.buttonIngrediends, 11);
        sViewsWithIds.put(R.id.buttonSteps, 12);
        sViewsWithIds.put(R.id.main_gradient_bottom, 13);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    @Nullable
    private final kotlin.jvm.functions.Function0 mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRecipeDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentRecipeDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (com.google.android.material.appbar.AppBarLayout) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[10]
            , (com.martianlab.recipes.presentation.views.base.BaseRecyclerView) bindings[7]
            , (android.view.View) bindings[13]
            , (android.widget.TextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (com.martianlab.recipes.presentation.views.base.BaseRecyclerView) bindings[8]
            , (com.google.android.material.appbar.MaterialToolbar) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.ingredientsListView.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recipeDifficult.setTag(null);
        this.recipeImage.setTag(null);
        this.recipeNameTextView.setTag(null);
        this.recipePersons.setTag(null);
        this.stagesListView.setTag(null);
        this.toolbar.setTag(null);
        this.toolbarTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.martianlab.recipes.generated.callback.Function0(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
            setViewModel((com.martianlab.recipes.presentation.fragments.details.DetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.martianlab.recipes.presentation.fragments.details.DetailsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelComplexity((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelImageURL((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelIngredientsList((androidx.databinding.ObservableField<java.util.List<com.martianlab.recipes.entities.RecipeIngredient>>) object, fieldId);
            case 3 :
                return onChangeViewModelStagesList((androidx.databinding.ObservableField<java.util.List<com.martianlab.recipes.entities.RecipeStage>>) object, fieldId);
            case 4 :
                return onChangeViewModelPersonsText((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelTitle((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelComplexity(androidx.databinding.ObservableField<java.lang.String> ViewModelComplexity, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelImageURL(androidx.databinding.ObservableField<java.lang.String> ViewModelImageURL, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIngredientsList(androidx.databinding.ObservableField<java.util.List<com.martianlab.recipes.entities.RecipeIngredient>> ViewModelIngredientsList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelStagesList(androidx.databinding.ObservableField<java.util.List<com.martianlab.recipes.entities.RecipeStage>> ViewModelStagesList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPersonsText(androidx.databinding.ObservableField<java.lang.String> ViewModelPersonsText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTitle(androidx.databinding.ObservableField<java.lang.String> ViewModelTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        androidx.databinding.ObservableField<java.lang.String> viewModelComplexity = null;
        java.lang.String viewModelImageURLGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelImageURL = null;
        androidx.databinding.ObservableField<java.util.List<com.martianlab.recipes.entities.RecipeIngredient>> viewModelIngredientsList = null;
        androidx.databinding.ObservableField<java.util.List<com.martianlab.recipes.entities.RecipeStage>> viewModelStagesList = null;
        java.lang.String viewModelPersonsTextGet = null;
        java.util.List<com.martianlab.recipes.entities.RecipeIngredient> viewModelIngredientsListGet = null;
        java.util.List<com.martianlab.recipes.entities.RecipeStage> viewModelStagesListGet = null;
        java.lang.String viewModelTitleGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelPersonsText = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelTitle = null;
        java.lang.String viewModelComplexityGet = null;
        com.martianlab.recipes.presentation.fragments.details.DetailsViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.complexity
                        viewModelComplexity = viewModel.getComplexity();
                    }
                    updateRegistration(0, viewModelComplexity);


                    if (viewModelComplexity != null) {
                        // read viewModel.complexity.get()
                        viewModelComplexityGet = viewModelComplexity.get();
                    }
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.imageURL
                        viewModelImageURL = viewModel.getImageURL();
                    }
                    updateRegistration(1, viewModelImageURL);


                    if (viewModelImageURL != null) {
                        // read viewModel.imageURL.get()
                        viewModelImageURLGet = viewModelImageURL.get();
                    }
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ingredientsList
                        viewModelIngredientsList = viewModel.getIngredientsList();
                    }
                    updateRegistration(2, viewModelIngredientsList);


                    if (viewModelIngredientsList != null) {
                        // read viewModel.ingredientsList.get()
                        viewModelIngredientsListGet = viewModelIngredientsList.get();
                    }
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.stagesList
                        viewModelStagesList = viewModel.getStagesList();
                    }
                    updateRegistration(3, viewModelStagesList);


                    if (viewModelStagesList != null) {
                        // read viewModel.stagesList.get()
                        viewModelStagesListGet = viewModelStagesList.get();
                    }
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.personsText
                        viewModelPersonsText = viewModel.getPersonsText();
                    }
                    updateRegistration(4, viewModelPersonsText);


                    if (viewModelPersonsText != null) {
                        // read viewModel.personsText.get()
                        viewModelPersonsTextGet = viewModelPersonsText.get();
                    }
            }
            if ((dirtyFlags & 0xe0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.title
                        viewModelTitle = viewModel.getTitle();
                    }
                    updateRegistration(5, viewModelTitle);


                    if (viewModelTitle != null) {
                        // read viewModel.title.get()
                        viewModelTitleGet = viewModelTitle.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            com.martianlab.recipes.presentation.views.base.BaseRecyclerView.setData(this.ingredientsListView, viewModelIngredientsListGet);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.recipeDifficult, viewModelComplexityGet);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            com.martianlab.recipes.presentation.binding.BindingAdapters.loadImage(this.recipeImage, viewModelImageURLGet);
        }
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.recipeNameTextView, viewModelTitleGet);
            this.toolbar.setTitle(viewModelTitleGet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.toolbarTitle, viewModelTitleGet);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.recipePersons, viewModelPersonsTextGet);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            com.martianlab.recipes.presentation.views.base.BaseRecyclerView.setData(this.stagesListView, viewModelStagesListGet);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            com.martianlab.recipes.presentation.binding.BindingAdapters.onNavigationClick(this.toolbar, mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final kotlin.Unit _internalCallbackInvoke(int sourceId ) {
        // localize variables for thread safety
        // viewModel
        com.martianlab.recipes.presentation.fragments.details.DetailsViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onBackPressed();
        }
        return null;
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.complexity
        flag 1 (0x2L): viewModel.imageURL
        flag 2 (0x3L): viewModel.ingredientsList
        flag 3 (0x4L): viewModel.stagesList
        flag 4 (0x5L): viewModel.personsText
        flag 5 (0x6L): viewModel.title
        flag 6 (0x7L): viewModel
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}