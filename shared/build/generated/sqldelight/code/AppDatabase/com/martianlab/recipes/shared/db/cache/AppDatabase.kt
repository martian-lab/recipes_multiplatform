package com.martianlab.recipes.shared.db.cache

import com.martianlab.recipes.shared.db.cache.shared.newInstance
import com.martianlab.recipes.shared.db.cache.shared.schema
import com.squareup.sqldelight.Transacter
import com.squareup.sqldelight.db.SqlDriver
import commartianlabrecipesshareddbcache.CategoryEntityQueries
import commartianlabrecipesshareddbcache.RecipeCommentEntity
import commartianlabrecipesshareddbcache.RecipeEntityQueries

interface AppDatabase : Transacter {
  val categoryEntityQueries: CategoryEntityQueries

  val recipeEntityQueries: RecipeEntityQueries

  companion object {
    val Schema: SqlDriver.Schema
      get() = AppDatabase::class.schema

    operator fun invoke(driver: SqlDriver, recipeCommentEntityAdapter: RecipeCommentEntity.Adapter):
        AppDatabase = AppDatabase::class.newInstance(driver, recipeCommentEntityAdapter)}
}
