package com.martianlab.recipes.presentation.views.base;

import android.content.Context;
import android.view.View;

public interface IView {

    Context getContext();

    void addOnAttachStateChangeListener(View.OnAttachStateChangeListener listener);

    int getVisibility();

    void setVisibility(int visibility);
}


