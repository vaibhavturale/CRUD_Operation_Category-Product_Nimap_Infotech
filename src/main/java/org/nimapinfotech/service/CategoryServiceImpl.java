package org.nimapinfotech.service;

import org.nimapinfotech.entity.Category;
import org.nimapinfotech.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepo;

    @Override
    public Page<Category> getAllCategories(int page, int size) {
        return categoryRepo.findAll(PageRequest.of(page,size));
    }

    @Override
    public Category createCategory(Category category) {
        return categoryRepo.save(category);
    }

    @Override
    public Optional<Category> getCategoryById(Long id) {
        return categoryRepo.findById(id);
    }

    @Override
    public Category updateCategory(Long id, Category category) {
        category.setId(id);
        return categoryRepo.save(category);
    }

    @Override
    public Boolean deleteCategory(Long id) {
        Optional<Category> category = categoryRepo.findById(id);
        if (category.isPresent()) {
            categoryRepo.deleteById(id);
            return true;
        }
        return false;
    }


}
