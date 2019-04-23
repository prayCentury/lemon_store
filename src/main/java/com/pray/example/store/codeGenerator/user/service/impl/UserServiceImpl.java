package com.pray.example.store.codeGenerator.user.service.impl;

import com.pray.example.store.codeGenerator.user.entity.UserEntity;
import com.pray.example.store.codeGenerator.user.mapper.UserMapper;
import com.pray.example.store.codeGenerator.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author pray
 * @since 2019-04-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements IUserService {

}
