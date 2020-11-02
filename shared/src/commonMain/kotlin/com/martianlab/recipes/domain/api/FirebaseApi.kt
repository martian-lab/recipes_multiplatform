package com.martianlab.recipes.domain.api

import com.martianlab.recipes.entities.FirebaseEvent


interface FirebaseApi {

    fun logEvent(event: FirebaseEvent)
}