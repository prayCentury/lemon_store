package com.pray.example.store.codeGenerator.user.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.pray.example.store.codeGenerator.base.controller.BaseController;
import com.pray.example.store.codeGenerator.user.entity.UserEntity;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author pray
 * @since 2019-04-23
 */
@RestController
@RequestMapping("/user")
@Api(tags = "user")
public class UserController extends BaseController<UserEntity> {



}

