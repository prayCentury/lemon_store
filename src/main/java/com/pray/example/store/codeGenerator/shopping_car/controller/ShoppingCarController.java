package com.pray.example.store.codeGenerator.shopping_car.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.pray.example.store.codeGenerator.base.controller.BaseController;
import com.pray.example.store.codeGenerator.shopping_car.entity.ShoppingCarModel;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author pray
 * @since 2019-04-22
 */
@RestController
@RequestMapping("/shopping_car")
@Api(tags = "shopping_car")
public class ShoppingCarController extends BaseController<ShoppingCarModel> {



}

