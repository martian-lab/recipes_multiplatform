package commartianlabrecipesshareddbcache

import kotlin.Int
import kotlin.Long
import kotlin.String

data class CategoryEntity(
  val id: Long,
  val imageUrl: String?,
  val title: String,
  val sort: Int,
  val total: Int
) {
  override fun toString(): String = """
  |CategoryEntity [
  |  id: $id
  |  imageUrl: $imageUrl
  |  title: $title
  |  sort: $sort
  |  total: $total
  |]
  """.trimMargin()
}
