package claire.springframework.spring5recipeapp.repositories;

import claire.springframework.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by claire on 14/02/21
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
