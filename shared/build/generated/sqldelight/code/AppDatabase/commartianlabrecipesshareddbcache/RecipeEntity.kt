package commartianlabrecipesshareddbcache

import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String

data class RecipeEntity(
  val id: Long,
  val title: String,
  val text: String,
  val complexity: Int,
  val personCount: Int,
  val imageURL: String,
  val rating: Double?,
  val ratingVotes: Int?
) {
  override fun toString(): String = """
  |RecipeEntity [
  |  id: $id
  |  title: $title
  |  text: $text
  |  complexity: $complexity
  |  personCount: $personCount
  |  imageURL: $imageURL
  |  rating: $rating
  |  ratingVotes: $ratingVotes
  |]
  """.trimMargin()
}
