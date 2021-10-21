package com.example.examprep.service;


import com.example.examprep.model.entity.Category;
import com.example.examprep.model.entity.CategoryNameEnum;

public interface CategoryService {
    void initCategories();

    Category findByCategoryNameEnum(CategoryNameEnum categoryNameEnum);
}
