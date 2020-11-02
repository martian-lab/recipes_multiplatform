package commartianlabrecipesshareddbcache

import com.squareup.sqldelight.Query
import com.squareup.sqldelight.Transacter
import kotlin.Any
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List

interface RecipeEntityQueries : Transacter {
  fun <T : Any> getRecipesByTagTitle(title: String, mapper: (
    id: Long,
    title: String,
    text: String,
    complexity: Int,
    personCount: Int,
    imageURL: String,
    rating: Double?,
    ratingVotes: Int?
  ) -> T): Query<T>

  fun getRecipesByTagTitle(title: String): Query<RecipeEntity>

  fun <T : Any> getRecipes(mapper: (
    id: Long,
    title: String,
    text: String,
    complexity: Int,
    personCount: Int,
    imageURL: String,
    rating: Double?,
    ratingVotes: Int?
  ) -> T): Query<T>

  fun getRecipes(): Query<RecipeEntity>

  fun <T : Any> getById(id: Long, mapper: (
    id: Long,
    title: String,
    text: String,
    complexity: Int,
    personCount: Int,
    imageURL: String,
    rating: Double?,
    ratingVotes: Int?
  ) -> T): Query<T>

  fun getById(id: Long): Query<RecipeEntity>

  fun <T : Any> searchRecipes(title: String, mapper: (
    id: Long,
    title: String,
    text: String,
    complexity: Int,
    personCount: Int,
    imageURL: String,
    rating: Double?,
    ratingVotes: Int?
  ) -> T): Query<T>

  fun searchRecipes(title: String): Query<RecipeEntity>

  fun <T : Any> searchIngredients(title: String, mapper: (
    id: Long,
    recipeId: Long,
    title: String,
    quantity: String,
    measureUnit: String,
    position: Int
  ) -> T): Query<T>

  fun searchIngredients(title: String): Query<RecipeIngredientEntity>

  fun <T : Any> getByIngredient(title: String, mapper: (
    id: Long,
    title: String,
    text: String,
    complexity: Int,
    personCount: Int,
    imageURL: String,
    rating: Double?,
    ratingVotes: Int?
  ) -> T): Query<T>

  fun getByIngredient(title: String): Query<RecipeEntity>

  fun <T : Any> getCommentsByRecipe(recipeId: Long, mapper: (
    id: Long,
    recipeId: Long,
    authorId: Long,
    authorName: String,
    date: String,
    text: String,
    parentCommentId: Long?,
    photoURLs: List<String>?
  ) -> T): Query<T>

  fun getCommentsByRecipe(recipeId: Long): Query<RecipeCommentEntity>

  fun <T : Any> getTagsByRecipe(recipeId: Long, mapper: (
    id: Long,
    title: String,
    recipeId: Long
  ) -> T): Query<T>

  fun getTagsByRecipe(recipeId: Long): Query<RecipeTagEntity>

  fun <T : Any> getIngredientsByRecipe(recipeId: Long, mapper: (
    id: Long,
    recipeId: Long,
    title: String,
    quantity: String,
    measureUnit: String,
    position: Int
  ) -> T): Query<T>

  fun getIngredientsByRecipe(recipeId: Long): Query<RecipeIngredientEntity>

  fun <T : Any> getStagesByRecipe(recipeId: Long, mapper: (
    id: Long,
    recipeId: Long,
    imageURL: String,
    text: String,
    step: Int
  ) -> T): Query<T>

  fun getStagesByRecipe(recipeId: Long): Query<RecipeStageEntity>

  fun insert(
    id: Long?,
    title: String,
    text: String,
    complexity: Int,
    personCount: Int,
    imageURL: String,
    rating: Double?,
    ratingVotes: Int?
  )

  fun insertRecipe(recipeEntity: RecipeEntity)

  fun insertComment(recipeCommentEntity: RecipeCommentEntity)

  fun insertIngredient(recipeIngredientEntity: RecipeIngredientEntity)

  fun insertStage(recipeStageEntity: RecipeStageEntity)

  fun insertTag(recipeTagEntity: RecipeTagEntity)

  fun insertComments(
    id: Long?,
    recipeId: Long,
    authorId: Long,
    authorName: String,
    date: String,
    text: String,
    parentCommentId: Long?,
    photoURLs: List<String>?
  )

  fun insertIngredients(
    id: Long,
    recipeId: Long,
    title: String,
    quantity: String,
    measureUnit: String,
    position: Int
  )

  fun insertStages(
    id: Long,
    recipeId: Long,
    imageURL: String,
    text: String,
    step: Int
  )

  fun insertTags(
    id: Long,
    title: String,
    recipeId: Long
  )

  fun removeTag(recipeId: Long, title: String)
}
