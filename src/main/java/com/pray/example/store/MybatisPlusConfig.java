package com.pray.example.store;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Package Name: com.pray.example.store
 * Created by Liu xi on 2019/4/12.
 * Version: V1.0
 * Des:
 */
@EnableTransactionManagement(proxyTargetClass = true)
@Configuration
@MapperScan({"com.pray.example.store.mybatisplus.mapper",
        "com.pray.example.store.codeGenerator.product.mapper",
        "com.pray.example.store.codeGenerator.shopping_car.mapper",
        "com.pray.example.store.codeGenerator.user.mapper"
})
public class MybatisPlusConfig {
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
