package com.martianlab.recipes.presentation.fragments.splash


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.martianlab.recipes.App
import com.martianlab.recipes.R
import com.martianlab.recipes.databinding.FragmentRecipesBinding
import com.martianlab.recipes.databinding.FragmentSplashBinding
import com.martianlab.recipes.domain.api.RoutingApi
import com.martianlab.recipes.entities.Destination
import com.martianlab.recipes.presentation.fragments.mainPage.MainPageViewModel


class SplashFragment : Fragment() {

//    val viewModel by lazy {
//        ViewModelProvider(this)[SplashViewModel::class.java]
//    }

    val viewModel : SplashViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
        FragmentSplashBinding.inflate(inflater)
            .apply { viewModel = this@SplashFragment.viewModel }
            .root

}
