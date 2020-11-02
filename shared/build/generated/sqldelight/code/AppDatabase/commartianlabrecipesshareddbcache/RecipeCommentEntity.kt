package commartianlabrecipesshareddbcache

import com.squareup.sqldelight.ColumnAdapter
import kotlin.Long
import kotlin.String
import kotlin.collections.List

data class RecipeCommentEntity(
  val id: Long,
  val recipeId: Long,
  val authorId: Long,
  val authorName: String,
  val date: String,
  val text: String,
  val parentCommentId: Long?,
  val photoURLs: List<String>?
) {
  override fun toString(): String = """
  |RecipeCommentEntity [
  |  id: $id
  |  recipeId: $recipeId
  |  authorId: $authorId
  |  authorName: $authorName
  |  date: $date
  |  text: $text
  |  parentCommentId: $parentCommentId
  |  photoURLs: $photoURLs
  |]
  """.trimMargin()

  class Adapter(
    val photoURLsAdapter: ColumnAdapter<List<String>, String>
  )
}
