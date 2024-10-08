package org.nimapinfotech.service;

import org.nimapinfotech.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

public interface CategoryService {

    Page<Category> getAllCategories(int page, int size);

    Category createCategory(Category category);

    Optional<Category> getCategoryById(Long id);

    Category updateCategory(Long id, Category category);

    Boolean deleteCategory(Long id);
}
