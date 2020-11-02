package com.martianlab.recipes.shared.db.cache.shared

import com.martianlab.recipes.shared.db.cache.AppDatabase
import com.squareup.sqldelight.Query
import com.squareup.sqldelight.TransacterImpl
import com.squareup.sqldelight.db.SqlCursor
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.internal.copyOnWriteList
import commartianlabrecipesshareddbcache.CategoryEntity
import commartianlabrecipesshareddbcache.CategoryEntityQueries
import commartianlabrecipesshareddbcache.RecipeCommentEntity
import commartianlabrecipesshareddbcache.RecipeEntity
import commartianlabrecipesshareddbcache.RecipeEntityQueries
import commartianlabrecipesshareddbcache.RecipeIngredientEntity
import commartianlabrecipesshareddbcache.RecipeStageEntity
import commartianlabrecipesshareddbcache.RecipeTagEntity
import kotlin.Any
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List
import kotlin.collections.MutableList
import kotlin.jvm.JvmField
import kotlin.reflect.KClass

internal val KClass<AppDatabase>.schema: SqlDriver.Schema
  get() = AppDatabaseImpl.Schema

internal fun KClass<AppDatabase>.newInstance(driver: SqlDriver,
    recipeCommentEntityAdapter: RecipeCommentEntity.Adapter): AppDatabase = AppDatabaseImpl(driver,
    recipeCommentEntityAdapter)

private class AppDatabaseImpl(
  driver: SqlDriver,
  internal val recipeCommentEntityAdapter: RecipeCommentEntity.Adapter
) : TransacterImpl(driver), AppDatabase {
  override val categoryEntityQueries: CategoryEntityQueriesImpl = CategoryEntityQueriesImpl(this,
      driver)

  override val recipeEntityQueries: RecipeEntityQueriesImpl = RecipeEntityQueriesImpl(this, driver)

  object Schema : SqlDriver.Schema {
    override val version: Int
      get() = 1

    override fun create(driver: SqlDriver) {
      driver.execute(null, """
          |CREATE TABLE IF NOT EXISTS `categoryEntity` (
          |    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
          |    `imageUrl` TEXT,
          |    `title` TEXT NOT NULL,
          |    `sort` INTEGER NOT NULL,
          |    `total` INTEGER NOT NULL
          |)
          """.trimMargin(), 0)
      driver.execute(null, """
          |CREATE TABLE IF NOT EXISTS `recipeEntity` (
          |    `id` INTEGER UNIQUE PRIMARY KEY AUTOINCREMENT NOT NULL,
          |    `title` TEXT NOT NULL,
          |    `text` TEXT NOT NULL,
          |    `complexity` INTEGER NOT NULL,
          |    `personCount` INTEGER NOT NULL,
          |    `imageURL` TEXT NOT NULL,
          |    `rating` REAL,
          |    `ratingVotes` INTEGER
          |)
          """.trimMargin(), 0)
      driver.execute(null, """
          |CREATE TABLE IF NOT EXISTS `userEntity` (
          |    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
          |    `name` TEXT NOT NULL,
          |    `pin` INTEGER NOT NULL
          |)
          """.trimMargin(), 0)
      driver.execute(null, """
          |CREATE TABLE IF NOT EXISTS `recipeTagEntity` (
          |    `id` INTEGER NOT NULL,
          |    `title` TEXT NOT NULL,
          |    `recipeId` INTEGER NOT NULL,
          |PRIMARY KEY(`id`,`recipeId`),
          |FOREIGN KEY(`recipeId`) REFERENCES `recipeEntity`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )
          """.trimMargin(), 0)
      driver.execute(null, """
          |CREATE TABLE IF NOT EXISTS `recipeCommentEntity` (
          |    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
          |    `recipeId` INTEGER NOT NULL,
          |    `authorId` INTEGER NOT NULL,
          |    `authorName` TEXT NOT NULL,
          |    `date` TEXT NOT NULL,
          |    `text` TEXT NOT NULL,
          |    `parentCommentId` INTEGER,
          |    `photoURLs` TEXT,
          |FOREIGN KEY(`recipeId`) REFERENCES `recipeEntity`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )
          """.trimMargin(), 0)
      driver.execute(null, """
          |CREATE TABLE IF NOT EXISTS `recipeIngredientEntity` (
          |    `id` INTEGER NOT NULL,
          |    `recipeId` INTEGER NOT NULL,
          |    `title` TEXT NOT NULL,
          |    `quantity` TEXT NOT NULL,
          |    `measureUnit` TEXT NOT NULL,
          |    `position` INTEGER NOT NULL,
          |PRIMARY KEY(`id`,`recipeId`),
          |FOREIGN KEY(`recipeId`) REFERENCES `recipeEntity`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )
          """.trimMargin(), 0)
      driver.execute(null, """
          |CREATE TABLE IF NOT EXISTS `recipeStageEntity` (
          |    `id` INTEGER NOT NULL,
          |    `recipeId` INTEGER NOT NULL,
          |    `imageURL` TEXT NOT NULL,
          |    `text` TEXT NOT NULL,
          |    `step` INTEGER NOT NULL,
          |PRIMARY KEY(`id`),
          |FOREIGN KEY(`recipeId`) REFERENCES `recipeEntity`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )
          """.trimMargin(), 0)
      driver.execute(null,
          "CREATE UNIQUE INDEX IF NOT EXISTS `index_User_pin` ON `userEntity` (`pin`)", 0)
      driver.execute(null,
          "CREATE INDEX IF NOT EXISTS `index_recipe_tag_recipeId` ON `recipeTagEntity` (`recipeId`)",
          0)
      driver.execute(null,
          "CREATE INDEX IF NOT EXISTS `index_recipe_tag_title` ON `recipeTagEntity` (`title`)", 0)
      driver.execute(null,
          "CREATE INDEX IF NOT EXISTS `index_recipe_comment_recipeId` ON `recipeCommentEntity` (`recipeId`)",
          0)
      driver.execute(null,
          "CREATE INDEX IF NOT EXISTS `index_recipe_ingredient_recipeId` ON `recipeIngredientEntity` (`recipeId`)",
          0)
      driver.execute(null,
          "CREATE INDEX IF NOT EXISTS `index_recipe_ingredient_title` ON `recipeIngredientEntity` (`title`)",
          0)
      driver.execute(null,
          "CREATE INDEX IF NOT EXISTS `index_recipe_entity_recipeId` ON `recipeStageEntity` (`recipeId`)",
          0)
    }

    override fun migrate(
      driver: SqlDriver,
      oldVersion: Int,
      newVersion: Int
    ) {
    }
  }
}

private class CategoryEntityQueriesImpl(
  private val database: AppDatabaseImpl,
  private val driver: SqlDriver
) : TransacterImpl(driver), CategoryEntityQueries {
  internal val getAll: MutableList<Query<*>> = copyOnWriteList()

  internal val getById: MutableList<Query<*>> = copyOnWriteList()

  override fun <T : Any> getAll(mapper: (
    id: Long,
    imageUrl: String?,
    title: String,
    sort: Int,
    total: Int
  ) -> T): Query<T> = Query(497827532, getAll, driver, "categoryEntity.sq", "getAll", """
  |SELECT *
  |FROM categoryEntity
  """.trimMargin()) { cursor ->
    mapper(
      cursor.getLong(0)!!,
      cursor.getString(1),
      cursor.getString(2)!!,
      cursor.getLong(3)!!.toInt(),
      cursor.getLong(4)!!.toInt()
    )
  }

  override fun getAll(): Query<CategoryEntity> = getAll(::CategoryEntity)

  override fun <T : Any> getById(id: Long, mapper: (
    id: Long,
    imageUrl: String?,
    title: String,
    sort: Int,
    total: Int
  ) -> T): Query<T> = GetByIdQuery(id) { cursor ->
    mapper(
      cursor.getLong(0)!!,
      cursor.getString(1),
      cursor.getString(2)!!,
      cursor.getLong(3)!!.toInt(),
      cursor.getLong(4)!!.toInt()
    )
  }

  override fun getById(id: Long): Query<CategoryEntity> = getById(id, ::CategoryEntity)

  override fun insert(categoryEntity: CategoryEntity) {
    driver.execute(563402522, """
    |INSERT INTO categoryEntity
    |VALUES (?, ?, ?, ?, ?)
    """.trimMargin(), 5) {
      bindLong(1, categoryEntity.id)
      bindString(2, categoryEntity.imageUrl)
      bindString(3, categoryEntity.title)
      bindLong(4, categoryEntity.sort.toLong())
      bindLong(5, categoryEntity.total.toLong())
    }
    notifyQueries(563402522, {database.categoryEntityQueries.getAll +
        database.categoryEntityQueries.getById})
  }

  override fun insertAll(categoryEntity: CategoryEntity) {
    driver.execute(-407593945, """
    |INSERT INTO categoryEntity
    |VALUES (?, ?, ?, ?, ?)
    """.trimMargin(), 5) {
      bindLong(1, categoryEntity.id)
      bindString(2, categoryEntity.imageUrl)
      bindString(3, categoryEntity.title)
      bindLong(4, categoryEntity.sort.toLong())
      bindLong(5, categoryEntity.total.toLong())
    }
    notifyQueries(-407593945, {database.categoryEntityQueries.getAll +
        database.categoryEntityQueries.getById})
  }

  override fun updatecategory(categoryEntity: CategoryEntity) {
    driver.execute(-1111211992, """
    |INSERT OR REPLACE INTO categoryEntity
    |VALUES (?, ?, ?, ?, ?)
    """.trimMargin(), 5) {
      bindLong(1, categoryEntity.id)
      bindString(2, categoryEntity.imageUrl)
      bindString(3, categoryEntity.title)
      bindLong(4, categoryEntity.sort.toLong())
      bindLong(5, categoryEntity.total.toLong())
    }
    notifyQueries(-1111211992, {database.categoryEntityQueries.getAll +
        database.categoryEntityQueries.getById})
  }

  private inner class GetByIdQuery<out T : Any>(
    @JvmField
    val id: Long,
    mapper: (SqlCursor) -> T
  ) : Query<T>(getById, mapper) {
    override fun execute(): SqlCursor = driver.executeQuery(-1747174393, """
    |SELECT *
    |FROM categoryEntity
    |WHERE id = ?
    """.trimMargin(), 1) {
      bindLong(1, id)
    }

    override fun toString(): String = "categoryEntity.sq:getById"
  }
}

private class RecipeEntityQueriesImpl(
  private val database: AppDatabaseImpl,
  private val driver: SqlDriver
) : TransacterImpl(driver), RecipeEntityQueries {
  internal val getRecipesByTagTitle: MutableList<Query<*>> = copyOnWriteList()

  internal val getRecipes: MutableList<Query<*>> = copyOnWriteList()

  internal val getById: MutableList<Query<*>> = copyOnWriteList()

  internal val searchRecipes: MutableList<Query<*>> = copyOnWriteList()

  internal val searchIngredients: MutableList<Query<*>> = copyOnWriteList()

  internal val getByIngredient: MutableList<Query<*>> = copyOnWriteList()

  internal val getCommentsByRecipe: MutableList<Query<*>> = copyOnWriteList()

  internal val getTagsByRecipe: MutableList<Query<*>> = copyOnWriteList()

  internal val getIngredientsByRecipe: MutableList<Query<*>> = copyOnWriteList()

  internal val getStagesByRecipe: MutableList<Query<*>> = copyOnWriteList()

  override fun <T : Any> getRecipesByTagTitle(title: String, mapper: (
    id: Long,
    title: String,
    text: String,
    complexity: Int,
    personCount: Int,
    imageURL: String,
    rating: Double?,
    ratingVotes: Int?
  ) -> T): Query<T> = GetRecipesByTagTitleQuery(title) { cursor ->
    mapper(
      cursor.getLong(0)!!,
      cursor.getString(1)!!,
      cursor.getString(2)!!,
      cursor.getLong(3)!!.toInt(),
      cursor.getLong(4)!!.toInt(),
      cursor.getString(5)!!,
      cursor.getDouble(6),
      cursor.getLong(7)?.toInt()
    )
  }

  override fun getRecipesByTagTitle(title: String): Query<RecipeEntity> =
      getRecipesByTagTitle(title, ::RecipeEntity)

  override fun <T : Any> getRecipes(mapper: (
    id: Long,
    title: String,
    text: String,
    complexity: Int,
    personCount: Int,
    imageURL: String,
    rating: Double?,
    ratingVotes: Int?
  ) -> T): Query<T> = Query(-302180000, getRecipes, driver, "recipeEntity.sq", "getRecipes",
      "SELECT recipeEntity.* FROM recipeEntity JOIN recipeTagEntity ON recipeEntity.id = recipeId")
      { cursor ->
    mapper(
      cursor.getLong(0)!!,
      cursor.getString(1)!!,
      cursor.getString(2)!!,
      cursor.getLong(3)!!.toInt(),
      cursor.getLong(4)!!.toInt(),
      cursor.getString(5)!!,
      cursor.getDouble(6),
      cursor.getLong(7)?.toInt()
    )
  }

  override fun getRecipes(): Query<RecipeEntity> = getRecipes(::RecipeEntity)

  override fun <T : Any> getById(id: Long, mapper: (
    id: Long,
    title: String,
    text: String,
    complexity: Int,
    personCount: Int,
    imageURL: String,
    rating: Double?,
    ratingVotes: Int?
  ) -> T): Query<T> = GetByIdQuery(id) { cursor ->
    mapper(
      cursor.getLong(0)!!,
      cursor.getString(1)!!,
      cursor.getString(2)!!,
      cursor.getLong(3)!!.toInt(),
      cursor.getLong(4)!!.toInt(),
      cursor.getString(5)!!,
      cursor.getDouble(6),
      cursor.getLong(7)?.toInt()
    )
  }

  override fun getById(id: Long): Query<RecipeEntity> = getById(id, ::RecipeEntity)

  override fun <T : Any> searchRecipes(title: String, mapper: (
    id: Long,
    title: String,
    text: String,
    complexity: Int,
    personCount: Int,
    imageURL: String,
    rating: Double?,
    ratingVotes: Int?
  ) -> T): Query<T> = SearchRecipesQuery(title) { cursor ->
    mapper(
      cursor.getLong(0)!!,
      cursor.getString(1)!!,
      cursor.getString(2)!!,
      cursor.getLong(3)!!.toInt(),
      cursor.getLong(4)!!.toInt(),
      cursor.getString(5)!!,
      cursor.getDouble(6),
      cursor.getLong(7)?.toInt()
    )
  }

  override fun searchRecipes(title: String): Query<RecipeEntity> = searchRecipes(title,
      ::RecipeEntity)

  override fun <T : Any> searchIngredients(title: String, mapper: (
    id: Long,
    recipeId: Long,
    title: String,
    quantity: String,
    measureUnit: String,
    position: Int
  ) -> T): Query<T> = SearchIngredientsQuery(title) { cursor ->
    mapper(
      cursor.getLong(0)!!,
      cursor.getLong(1)!!,
      cursor.getString(2)!!,
      cursor.getString(3)!!,
      cursor.getString(4)!!,
      cursor.getLong(5)!!.toInt()
    )
  }

  override fun searchIngredients(title: String): Query<RecipeIngredientEntity> =
      searchIngredients(title, ::RecipeIngredientEntity)

  override fun <T : Any> getByIngredient(title: String, mapper: (
    id: Long,
    title: String,
    text: String,
    complexity: Int,
    personCount: Int,
    imageURL: String,
    rating: Double?,
    ratingVotes: Int?
  ) -> T): Query<T> = GetByIngredientQuery(title) { cursor ->
    mapper(
      cursor.getLong(0)!!,
      cursor.getString(1)!!,
      cursor.getString(2)!!,
      cursor.getLong(3)!!.toInt(),
      cursor.getLong(4)!!.toInt(),
      cursor.getString(5)!!,
      cursor.getDouble(6),
      cursor.getLong(7)?.toInt()
    )
  }

  override fun getByIngredient(title: String): Query<RecipeEntity> = getByIngredient(title,
      ::RecipeEntity)

  override fun <T : Any> getCommentsByRecipe(recipeId: Long, mapper: (
    id: Long,
    recipeId: Long,
    authorId: Long,
    authorName: String,
    date: String,
    text: String,
    parentCommentId: Long?,
    photoURLs: List<String>?
  ) -> T): Query<T> = GetCommentsByRecipeQuery(recipeId) { cursor ->
    mapper(
      cursor.getLong(0)!!,
      cursor.getLong(1)!!,
      cursor.getLong(2)!!,
      cursor.getString(3)!!,
      cursor.getString(4)!!,
      cursor.getString(5)!!,
      cursor.getLong(6),
      cursor.getString(7)?.let(database.recipeCommentEntityAdapter.photoURLsAdapter::decode)
    )
  }

  override fun getCommentsByRecipe(recipeId: Long): Query<RecipeCommentEntity> =
      getCommentsByRecipe(recipeId, ::RecipeCommentEntity)

  override fun <T : Any> getTagsByRecipe(recipeId: Long, mapper: (
    id: Long,
    title: String,
    recipeId: Long
  ) -> T): Query<T> = GetTagsByRecipeQuery(recipeId) { cursor ->
    mapper(
      cursor.getLong(0)!!,
      cursor.getString(1)!!,
      cursor.getLong(2)!!
    )
  }

  override fun getTagsByRecipe(recipeId: Long): Query<RecipeTagEntity> = getTagsByRecipe(recipeId,
      ::RecipeTagEntity)

  override fun <T : Any> getIngredientsByRecipe(recipeId: Long, mapper: (
    id: Long,
    recipeId: Long,
    title: String,
    quantity: String,
    measureUnit: String,
    position: Int
  ) -> T): Query<T> = GetIngredientsByRecipeQuery(recipeId) { cursor ->
    mapper(
      cursor.getLong(0)!!,
      cursor.getLong(1)!!,
      cursor.getString(2)!!,
      cursor.getString(3)!!,
      cursor.getString(4)!!,
      cursor.getLong(5)!!.toInt()
    )
  }

  override fun getIngredientsByRecipe(recipeId: Long): Query<RecipeIngredientEntity> =
      getIngredientsByRecipe(recipeId, ::RecipeIngredientEntity)

  override fun <T : Any> getStagesByRecipe(recipeId: Long, mapper: (
    id: Long,
    recipeId: Long,
    imageURL: String,
    text: String,
    step: Int
  ) -> T): Query<T> = GetStagesByRecipeQuery(recipeId) { cursor ->
    mapper(
      cursor.getLong(0)!!,
      cursor.getLong(1)!!,
      cursor.getString(2)!!,
      cursor.getString(3)!!,
      cursor.getLong(4)!!.toInt()
    )
  }

  override fun getStagesByRecipe(recipeId: Long): Query<RecipeStageEntity> =
      getStagesByRecipe(recipeId, ::RecipeStageEntity)

  override fun insert(
    id: Long?,
    title: String,
    text: String,
    complexity: Int,
    personCount: Int,
    imageURL: String,
    rating: Double?,
    ratingVotes: Int?
  ) {
    driver.execute(1402758186,
        """INSERT OR REPLACE INTO `recipeEntity` (`id`,`title`,`text`,`complexity`,`personCount`,`imageURL`,`rating`,`ratingVotes`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)""",
        8) {
      bindLong(1, id)
      bindString(2, title)
      bindString(3, text)
      bindLong(4, complexity.toLong())
      bindLong(5, personCount.toLong())
      bindString(6, imageURL)
      bindDouble(7, rating)
      bindLong(8, ratingVotes?.let { it.toLong() })
    }
    notifyQueries(1402758186, {database.recipeEntityQueries.getRecipesByTagTitle +
        database.recipeEntityQueries.getRecipes + database.recipeEntityQueries.getById +
        database.recipeEntityQueries.searchRecipes + database.recipeEntityQueries.getByIngredient})
  }

  override fun insertRecipe(recipeEntity: RecipeEntity) {
    driver.execute(1563582040,
        """INSERT OR REPLACE INTO `recipeEntity`  VALUES (?, ?, ?, ?, ?, ?, ?, ?)""", 8) {
      bindLong(1, recipeEntity.id)
      bindString(2, recipeEntity.title)
      bindString(3, recipeEntity.text)
      bindLong(4, recipeEntity.complexity.toLong())
      bindLong(5, recipeEntity.personCount.toLong())
      bindString(6, recipeEntity.imageURL)
      bindDouble(7, recipeEntity.rating)
      bindLong(8, recipeEntity.ratingVotes?.let { it.toLong() })
    }
    notifyQueries(1563582040, {database.recipeEntityQueries.getRecipesByTagTitle +
        database.recipeEntityQueries.getRecipes + database.recipeEntityQueries.getById +
        database.recipeEntityQueries.searchRecipes + database.recipeEntityQueries.getByIngredient})
  }

  override fun insertComment(recipeCommentEntity: RecipeCommentEntity) {
    driver.execute(1094385365,
        """INSERT OR REPLACE INTO `recipeCommentEntity`  VALUES (?, ?, ?, ?, ?, ?, ?, ?)""", 8) {
      bindLong(1, recipeCommentEntity.id)
      bindLong(2, recipeCommentEntity.recipeId)
      bindLong(3, recipeCommentEntity.authorId)
      bindString(4, recipeCommentEntity.authorName)
      bindString(5, recipeCommentEntity.date)
      bindString(6, recipeCommentEntity.text)
      bindLong(7, recipeCommentEntity.parentCommentId)
      bindString(8, recipeCommentEntity.photoURLs?.let {
          database.recipeCommentEntityAdapter.photoURLsAdapter.encode(it) })
    }
    notifyQueries(1094385365, {database.recipeEntityQueries.getCommentsByRecipe})
  }

  override fun insertIngredient(recipeIngredientEntity: RecipeIngredientEntity) {
    driver.execute(-1367800421,
        """INSERT OR REPLACE INTO `recipeIngredientEntity`  VALUES (?, ?, ?, ?, ?, ?)""", 6) {
      bindLong(1, recipeIngredientEntity.id)
      bindLong(2, recipeIngredientEntity.recipeId)
      bindString(3, recipeIngredientEntity.title)
      bindString(4, recipeIngredientEntity.quantity)
      bindString(5, recipeIngredientEntity.measureUnit)
      bindLong(6, recipeIngredientEntity.position.toLong())
    }
    notifyQueries(-1367800421, {database.recipeEntityQueries.searchIngredients +
        database.recipeEntityQueries.getByIngredient +
        database.recipeEntityQueries.getIngredientsByRecipe})
  }

  override fun insertStage(recipeStageEntity: RecipeStageEntity) {
    driver.execute(2130016500,
        """INSERT OR REPLACE INTO `recipeStageEntity`  VALUES (?, ?, ?, ?, ?)""", 5) {
      bindLong(1, recipeStageEntity.id)
      bindLong(2, recipeStageEntity.recipeId)
      bindString(3, recipeStageEntity.imageURL)
      bindString(4, recipeStageEntity.text)
      bindLong(5, recipeStageEntity.step.toLong())
    }
    notifyQueries(2130016500, {database.recipeEntityQueries.getStagesByRecipe})
  }

  override fun insertTag(recipeTagEntity: RecipeTagEntity) {
    driver.execute(-462587120, """INSERT OR REPLACE INTO `recipeTagEntity`  VALUES (?, ?, ?)""", 3)
        {
      bindLong(1, recipeTagEntity.id)
      bindString(2, recipeTagEntity.title)
      bindLong(3, recipeTagEntity.recipeId)
    }
    notifyQueries(-462587120, {database.recipeEntityQueries.getRecipesByTagTitle +
        database.recipeEntityQueries.getRecipes + database.recipeEntityQueries.getTagsByRecipe})
  }

  override fun insertComments(
    id: Long?,
    recipeId: Long,
    authorId: Long,
    authorName: String,
    date: String,
    text: String,
    parentCommentId: Long?,
    photoURLs: List<String>?
  ) {
    driver.execute(-433791938,
        """INSERT OR REPLACE INTO `recipeCommentEntity` (`id`,`recipeId`,`authorId`,`authorName`,`date`,`text`,`parentCommentId`,`photoURLs`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)""",
        8) {
      bindLong(1, id)
      bindLong(2, recipeId)
      bindLong(3, authorId)
      bindString(4, authorName)
      bindString(5, date)
      bindString(6, text)
      bindLong(7, parentCommentId)
      bindString(8, photoURLs?.let { database.recipeCommentEntityAdapter.photoURLsAdapter.encode(it)
          })
    }
    notifyQueries(-433791938, {database.recipeEntityQueries.getCommentsByRecipe})
  }

  override fun insertIngredients(
    id: Long,
    recipeId: Long,
    title: String,
    quantity: String,
    measureUnit: String,
    position: Int
  ) {
    driver.execute(547860024,
        """INSERT OR REPLACE INTO `recipeIngredientEntity` (`id`,`recipeId`,`title`,`quantity`,`measureUnit`,`position`) VALUES (?,?,?,?,?,?)""",
        6) {
      bindLong(1, id)
      bindLong(2, recipeId)
      bindString(3, title)
      bindString(4, quantity)
      bindString(5, measureUnit)
      bindLong(6, position.toLong())
    }
    notifyQueries(547860024, {database.recipeEntityQueries.searchIngredients +
        database.recipeEntityQueries.getByIngredient +
        database.recipeEntityQueries.getIngredientsByRecipe})
  }

  override fun insertStages(
    id: Long,
    recipeId: Long,
    imageURL: String,
    text: String,
    step: Int
  ) {
    driver.execute(1606002175,
        """INSERT OR REPLACE INTO `recipeStageEntity` (`id`,`recipeId`,`imageURL`,`text`,`step`) VALUES (?,?,?,?,?)""",
        5) {
      bindLong(1, id)
      bindLong(2, recipeId)
      bindString(3, imageURL)
      bindString(4, text)
      bindLong(5, step.toLong())
    }
    notifyQueries(1606002175, {database.recipeEntityQueries.getStagesByRecipe})
  }

  override fun insertTags(
    id: Long,
    title: String,
    recipeId: Long
  ) {
    driver.execute(-1455298717,
        """INSERT OR REPLACE INTO `recipeTagEntity` (`id`,`title`,`recipeId`) VALUES (?,?,?)""", 3)
        {
      bindLong(1, id)
      bindString(2, title)
      bindLong(3, recipeId)
    }
    notifyQueries(-1455298717, {database.recipeEntityQueries.getRecipesByTagTitle +
        database.recipeEntityQueries.getRecipes + database.recipeEntityQueries.getTagsByRecipe})
  }

  override fun removeTag(recipeId: Long, title: String) {
    driver.execute(1204252005, """DELETE FROM recipeTagEntity WHERE recipeId = ? AND title  = ?""",
        2) {
      bindLong(1, recipeId)
      bindString(2, title)
    }
    notifyQueries(1204252005, {database.recipeEntityQueries.getRecipesByTagTitle +
        database.recipeEntityQueries.getRecipes + database.recipeEntityQueries.getTagsByRecipe})
  }

  private inner class GetRecipesByTagTitleQuery<out T : Any>(
    @JvmField
    val title: String,
    mapper: (SqlCursor) -> T
  ) : Query<T>(getRecipesByTagTitle, mapper) {
    override fun execute(): SqlCursor = driver.executeQuery(1710229973,
        """SELECT recipeEntity.* FROM recipeEntity JOIN recipeTagEntity ON recipeEntity.id = recipeId WHERE recipeTagEntity.title = ? ORDER BY recipeEntity.rating DESC, recipeEntity.id DESC""",
        1) {
      bindString(1, title)
    }

    override fun toString(): String = "recipeEntity.sq:getRecipesByTagTitle"
  }

  private inner class GetByIdQuery<out T : Any>(
    @JvmField
    val id: Long,
    mapper: (SqlCursor) -> T
  ) : Query<T>(getById, mapper) {
    override fun execute(): SqlCursor = driver.executeQuery(-1496952585,
        """SELECT * FROM recipeEntity WHERE id = ?""", 1) {
      bindLong(1, id)
    }

    override fun toString(): String = "recipeEntity.sq:getById"
  }

  private inner class SearchRecipesQuery<out T : Any>(
    @JvmField
    val title: String,
    mapper: (SqlCursor) -> T
  ) : Query<T>(searchRecipes, mapper) {
    override fun execute(): SqlCursor = driver.executeQuery(-1240567988,
        """SELECT * FROM recipeEntity WHERE recipeEntity.title LIKE ?""", 1) {
      bindString(1, title)
    }

    override fun toString(): String = "recipeEntity.sq:searchRecipes"
  }

  private inner class SearchIngredientsQuery<out T : Any>(
    @JvmField
    val title: String,
    mapper: (SqlCursor) -> T
  ) : Query<T>(searchIngredients, mapper) {
    override fun execute(): SqlCursor = driver.executeQuery(704524265,
        """SELECT * FROM recipeIngredientEntity WHERE recipeIngredientEntity.title LIKE ?""", 1) {
      bindString(1, title)
    }

    override fun toString(): String = "recipeEntity.sq:searchIngredients"
  }

  private inner class GetByIngredientQuery<out T : Any>(
    @JvmField
    val title: String,
    mapper: (SqlCursor) -> T
  ) : Query<T>(getByIngredient, mapper) {
    override fun execute(): SqlCursor = driver.executeQuery(-933946963,
        """SELECT recipeEntity.* FROM recipeEntity JOIN recipeIngredientEntity ON recipeEntity.id = recipeId WHERE recipeIngredientEntity.title = ?""",
        1) {
      bindString(1, title)
    }

    override fun toString(): String = "recipeEntity.sq:getByIngredient"
  }

  private inner class GetCommentsByRecipeQuery<out T : Any>(
    @JvmField
    val recipeId: Long,
    mapper: (SqlCursor) -> T
  ) : Query<T>(getCommentsByRecipe, mapper) {
    override fun execute(): SqlCursor = driver.executeQuery(-286268290,
        """SELECT * FROM recipeCommentEntity WHERE recipeId = ?""", 1) {
      bindLong(1, recipeId)
    }

    override fun toString(): String = "recipeEntity.sq:getCommentsByRecipe"
  }

  private inner class GetTagsByRecipeQuery<out T : Any>(
    @JvmField
    val recipeId: Long,
    mapper: (SqlCursor) -> T
  ) : Query<T>(getTagsByRecipe, mapper) {
    override fun execute(): SqlCursor = driver.executeQuery(833806371,
        """SELECT * FROM recipeTagEntity WHERE recipeId = ?""", 1) {
      bindLong(1, recipeId)
    }

    override fun toString(): String = "recipeEntity.sq:getTagsByRecipe"
  }

  private inner class GetIngredientsByRecipeQuery<out T : Any>(
    @JvmField
    val recipeId: Long,
    mapper: (SqlCursor) -> T
  ) : Query<T>(getIngredientsByRecipe, mapper) {
    override fun execute(): SqlCursor = driver.executeQuery(-1867565086,
        """SELECT * FROM recipeIngredientEntity WHERE recipeId = ?""", 1) {
      bindLong(1, recipeId)
    }

    override fun toString(): String = "recipeEntity.sq:getIngredientsByRecipe"
  }

  private inner class GetStagesByRecipeQuery<out T : Any>(
    @JvmField
    val recipeId: Long,
    mapper: (SqlCursor) -> T
  ) : Query<T>(getStagesByRecipe, mapper) {
    override fun execute(): SqlCursor = driver.executeQuery(-1399982081,
        """SELECT * FROM recipeStageEntity WHERE recipeId = ?""", 1) {
      bindLong(1, recipeId)
    }

    override fun toString(): String = "recipeEntity.sq:getStagesByRecipe"
  }
}
