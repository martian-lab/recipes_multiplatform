package commartianlabrecipesshareddbcache

import com.squareup.sqldelight.Query
import com.squareup.sqldelight.Transacter
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String

interface CategoryEntityQueries : Transacter {
  fun <T : Any> getAll(mapper: (
    id: Long,
    imageUrl: String?,
    title: String,
    sort: Int,
    total: Int
  ) -> T): Query<T>

  fun getAll(): Query<CategoryEntity>

  fun <T : Any> getById(id: Long, mapper: (
    id: Long,
    imageUrl: String?,
    title: String,
    sort: Int,
    total: Int
  ) -> T): Query<T>

  fun getById(id: Long): Query<CategoryEntity>

  fun insert(categoryEntity: CategoryEntity)

  fun insertAll(categoryEntity: CategoryEntity)

  fun updatecategory(categoryEntity: CategoryEntity)
}
