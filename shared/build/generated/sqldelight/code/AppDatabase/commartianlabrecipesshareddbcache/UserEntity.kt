package commartianlabrecipesshareddbcache

import kotlin.Int
import kotlin.String

data class UserEntity(
  val id: Int,
  val name: String,
  val pin: Int
) {
  override fun toString(): String = """
  |UserEntity [
  |  id: $id
  |  name: $name
  |  pin: $pin
  |]
  """.trimMargin()
}
