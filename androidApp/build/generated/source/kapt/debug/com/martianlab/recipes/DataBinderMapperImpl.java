package com.martianlab.recipes;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.martianlab.recipes.databinding.FragmentRecipeDetailsBindingImpl;
import com.martianlab.recipes.databinding.FragmentRecipesBindingImpl;
import com.martianlab.recipes.databinding.FragmentSplashBindingImpl;
import com.martianlab.recipes.databinding.RecipeCategoryItemBindingImpl;
import com.martianlab.recipes.databinding.RecipeIngredientItemBindingImpl;
import com.martianlab.recipes.databinding.RecipeItemBindingImpl;
import com.martianlab.recipes.databinding.RecipeStageItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTRECIPEDETAILS = 1;

  private static final int LAYOUT_FRAGMENTRECIPES = 2;

  private static final int LAYOUT_FRAGMENTSPLASH = 3;

  private static final int LAYOUT_RECIPECATEGORYITEM = 4;

  private static final int LAYOUT_RECIPEINGREDIENTITEM = 5;

  private static final int LAYOUT_RECIPEITEM = 6;

  private static final int LAYOUT_RECIPESTAGEITEM = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.martianlab.recipes.R.layout.fragment_recipe_details, LAYOUT_FRAGMENTRECIPEDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.martianlab.recipes.R.layout.fragment_recipes, LAYOUT_FRAGMENTRECIPES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.martianlab.recipes.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.martianlab.recipes.R.layout.recipe_category_item, LAYOUT_RECIPECATEGORYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.martianlab.recipes.R.layout.recipe_ingredient_item, LAYOUT_RECIPEINGREDIENTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.martianlab.recipes.R.layout.recipe_item, LAYOUT_RECIPEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.martianlab.recipes.R.layout.recipe_stage_item, LAYOUT_RECIPESTAGEITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTRECIPEDETAILS: {
          if ("layout/fragment_recipe_details_0".equals(tag)) {
            return new FragmentRecipeDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_recipe_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTRECIPES: {
          if ("layout/fragment_recipes_0".equals(tag)) {
            return new FragmentRecipesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_recipes is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPLASH: {
          if ("layout/fragment_splash_0".equals(tag)) {
            return new FragmentSplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_RECIPECATEGORYITEM: {
          if ("layout/recipe_category_item_0".equals(tag)) {
            return new RecipeCategoryItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recipe_category_item is invalid. Received: " + tag);
        }
        case  LAYOUT_RECIPEINGREDIENTITEM: {
          if ("layout/recipe_ingredient_item_0".equals(tag)) {
            return new RecipeIngredientItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recipe_ingredient_item is invalid. Received: " + tag);
        }
        case  LAYOUT_RECIPEITEM: {
          if ("layout/recipe_item_0".equals(tag)) {
            return new RecipeItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recipe_item is invalid. Received: " + tag);
        }
        case  LAYOUT_RECIPESTAGEITEM: {
          if ("layout/recipe_stage_item_0".equals(tag)) {
            return new RecipeStageItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recipe_stage_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/fragment_recipe_details_0", com.martianlab.recipes.R.layout.fragment_recipe_details);
      sKeys.put("layout/fragment_recipes_0", com.martianlab.recipes.R.layout.fragment_recipes);
      sKeys.put("layout/fragment_splash_0", com.martianlab.recipes.R.layout.fragment_splash);
      sKeys.put("layout/recipe_category_item_0", com.martianlab.recipes.R.layout.recipe_category_item);
      sKeys.put("layout/recipe_ingredient_item_0", com.martianlab.recipes.R.layout.recipe_ingredient_item);
      sKeys.put("layout/recipe_item_0", com.martianlab.recipes.R.layout.recipe_item);
      sKeys.put("layout/recipe_stage_item_0", com.martianlab.recipes.R.layout.recipe_stage_item);
    }
  }
}
