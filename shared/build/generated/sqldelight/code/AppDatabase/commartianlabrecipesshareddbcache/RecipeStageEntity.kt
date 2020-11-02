package commartianlabrecipesshareddbcache

import kotlin.Int
import kotlin.Long
import kotlin.String

data class RecipeStageEntity(
  val id: Long,
  val recipeId: Long,
  val imageURL: String,
  val text: String,
  val step: Int
) {
  override fun toString(): String = """
  |RecipeStageEntity [
  |  id: $id
  |  recipeId: $recipeId
  |  imageURL: $imageURL
  |  text: $text
  |  step: $step
  |]
  """.trimMargin()
}
