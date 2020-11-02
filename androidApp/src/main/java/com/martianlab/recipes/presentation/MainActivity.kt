package com.martianlab.recipes.presentation

import android.Manifest
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import com.martianlab.recipes.App
import com.martianlab.recipes.R
import com.martianlab.recipes.domain.api.RoutingApi
import com.martianlab.recipes.entities.Destination
import java.lang.ref.WeakReference


class MainActivity : FragmentActivity() {

    //@Inject
    //lateinit var routingApi: RoutingApi

    private val requestPermissionsLauncher = registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { result ->

        if( result.filterValues { it == false }.count() == 0 )
            return@registerForActivityResult
        else
            AlertDialog
                .Builder(this@MainActivity)
                .setMessage("Нельзя использовать приложение без необходимых разрешений")
                .setPositiveButton("Понятно", { _, i -> finish() })
                .show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        App.fragmentManager = WeakReference(supportFragmentManager)
        requestPermissions()
    }

    override fun onStart() {
        super.onStart()

        //App.fragmentActivity = WeakReference(this)
    }

    override fun onResume() {
        super.onResume()
        //App.component.inject(this)
        //routingApi.goTo(Destination.Splash)
    }


    private fun requestPermissions(){

        requestPermissionsLauncher.launch(arrayOf(
            Manifest.permission.INTERNET
        ))

    }
}
