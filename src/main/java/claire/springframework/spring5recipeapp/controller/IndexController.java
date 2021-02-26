package claire.springframework.spring5recipeapp.controller;

import claire.springframework.spring5recipeapp.domain.Category;
import claire.springframework.spring5recipeapp.domain.UnitOfMeasure;
import claire.springframework.spring5recipeapp.repositories.CategoryRepository;
import claire.springframework.spring5recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by claire on 29/12/20
 */
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        System.out.println("Some message to say... 1234567");

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByUom("Teaspoon");

        System.out.println("Cat ID is " + categoryOptional.get().getId());
        System.out.println("UOM ID is " + unitOfMeasureOptional.get().getId());

        return "Index";
    }
}
