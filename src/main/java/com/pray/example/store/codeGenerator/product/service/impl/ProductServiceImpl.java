package com.pray.example.store.codeGenerator.product.service.impl;

import com.pray.example.store.codeGenerator.product.entity.ProductModel;
import com.pray.example.store.codeGenerator.product.mapper.ProductMapper;
import com.pray.example.store.codeGenerator.product.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author pray
 * @since 2019-04-22
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, ProductModel> implements IProductService {

}
