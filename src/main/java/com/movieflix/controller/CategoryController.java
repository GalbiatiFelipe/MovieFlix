package com.movieflix.controller;

import com.movieflix.entity.Category;
import com.movieflix.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movieflix/category")
@RequiredArgsConstructor
public class CategoryController {

    /*
    * injeção de dependencia
    * -Com anotação @Autowired
    * -Usando Lombok, com anotação @RequiredArgsConstructor
    * -Criando um construtor para o atributo
    * */
    private final CategoryService categoryService;

    @GetMapping
    public List<Category> findAllCategories() {
        return categoryService.findAll();
    }
}
