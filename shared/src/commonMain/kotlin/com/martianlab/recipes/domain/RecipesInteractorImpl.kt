package com.martianlab.recipes.domain

import com.martianlab.recipes.domain.api.BackendApi
import com.martianlab.recipes.domain.api.DbApi
import com.martianlab.recipes.domain.api.RoutingApi
import com.martianlab.recipes.entities.*
import kotlinx.coroutines.flow.Flow



internal class RecipesInteractorImpl constructor(
    val recipesRepository: RecipesRepository,
    val dbApi: DbApi,
    val backendApi: BackendApi,
    private val router : RoutingApi
) : RecipesInteractor{

    override fun onBackPressed() {
        router.goBack()
    }

    override fun goTo(destination: Destination){
        router.goTo(destination)
    }

    override suspend fun loadToDb() {
        recipesRepository.loadRecipesToDb()
    }

    override suspend fun getCategories(): List<Category> {
        return recipesRepository.loadCategoriesFromDb()
    }

    override suspend fun loadToDbFlow(): Flow<String> {
        return recipesRepository.loadRecipesToDbFlow()
    }

    override suspend fun getRecipes(): List<Recipe> {
        return recipesRepository.loadRecipes()
    }

    override suspend fun getRecipes(category: Category): List<Recipe> {
        val tags = listOf(RecipeTag(category.id, 0L, category.title))
        return recipesRepository.loadRecipes(tags)
    }

    //    override fun getRecipesPaged(category: Category): LiveData<PagedList<Recipe>> {
//        val tags = listOf(RecipeTag(category.id, 0L, category.title))
//        return recipesRepository.loadRecipesPaged(tags)
//    }


    override suspend fun getRecipe(id: Long): Recipe? {
        return recipesRepository.getRecipe(id)
    }

    override suspend fun firstLaunchCheck() {
        recipesRepository.loadCategoriesFromDb()
    }

    override suspend fun searchIngredients(contains: String): List<RecipeIngredient> = recipesRepository.searchIngredients(contains)
    override suspend fun searchRecipes(contains: String): List<Recipe> = recipesRepository.searchRecipes(contains)
    override suspend fun setFavorite(recipe: Recipe) = recipesRepository.setFavorite(recipe)
    override suspend fun removeFavorite(recipe: Recipe) = recipesRepository.removeFavorite(recipe)
    override suspend fun getFavorites(): List<Recipe> = recipesRepository.getFavorites()
}