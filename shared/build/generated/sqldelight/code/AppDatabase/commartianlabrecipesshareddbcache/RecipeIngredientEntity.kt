package commartianlabrecipesshareddbcache

import kotlin.Int
import kotlin.Long
import kotlin.String

data class RecipeIngredientEntity(
  val id: Long,
  val recipeId: Long,
  val title: String,
  val quantity: String,
  val measureUnit: String,
  val position: Int
) {
  override fun toString(): String = """
  |RecipeIngredientEntity [
  |  id: $id
  |  recipeId: $recipeId
  |  title: $title
  |  quantity: $quantity
  |  measureUnit: $measureUnit
  |  position: $position
  |]
  """.trimMargin()
}
