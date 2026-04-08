package com.movieflix.service;

import com.movieflix.entity.Category;
import com.movieflix.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    /*
     * injeção de dependencia
     * -Com anotação @Autowired
     * -Usando Lombok, com anotação @RequiredArgsConstructor
     * -Criando um construtor para o atributo
     * */
    private final CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

}
