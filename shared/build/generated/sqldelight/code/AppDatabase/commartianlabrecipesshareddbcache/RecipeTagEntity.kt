package commartianlabrecipesshareddbcache

import kotlin.Long
import kotlin.String

data class RecipeTagEntity(
  val id: Long,
  val title: String,
  val recipeId: Long
) {
  override fun toString(): String = """
  |RecipeTagEntity [
  |  id: $id
  |  title: $title
  |  recipeId: $recipeId
  |]
  """.trimMargin()
}
