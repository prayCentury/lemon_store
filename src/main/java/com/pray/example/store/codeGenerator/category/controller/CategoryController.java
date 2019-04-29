package com.pray.example.store.codeGenerator.category.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.pray.example.store.codeGenerator.base.controller.BaseController;
import com.pray.example.store.codeGenerator.category.entity.CategoryEntity;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author pray
 * @since 2019-04-24
 */
@RestController
@RequestMapping("/category")
@Api(tags = "category")
public class CategoryController extends BaseController<CategoryEntity> {



}

