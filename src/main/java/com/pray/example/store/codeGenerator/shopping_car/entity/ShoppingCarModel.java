package com.pray.example.store.codeGenerator.shopping_car.entity;

import com.pray.example.store.codeGenerator.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author pray
 * @since 2019-04-22
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("shopping_car")
@ApiModel(value="ShoppingCarModel对象", description="")
public class ShoppingCarModel extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Integer userId;

    private Integer proId;

    private Integer proNum;

    private String date;


}
