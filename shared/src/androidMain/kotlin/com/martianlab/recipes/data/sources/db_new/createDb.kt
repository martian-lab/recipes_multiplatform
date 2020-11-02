package com.martianlab.data.sources.db_new

import android.content.Context
import com.martianlab.data.sources.db_new.converters.Converters
import com.martianlab.recipes.shared.db.cache.AppDatabase
import com.squareup.sqldelight.android.AndroidSqliteDriver
import commartianlabrecipesshareddbcache.RecipeCommentEntity

lateinit var appContext: Context

actual fun createDb(): AppDatabase? {
    val driver = AndroidSqliteDriver(AppDatabase.Schema, appContext, "recipes.db")
    return AppDatabase(driver, recipeCommentEntityAdapter = RecipeCommentEntity.Adapter(photoURLsAdapter = Converters.listOfStringsAdapter))
}
