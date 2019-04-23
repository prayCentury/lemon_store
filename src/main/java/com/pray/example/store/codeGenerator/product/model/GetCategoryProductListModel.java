package com.pray.example.store.codeGenerator.product.model;

import com.pray.example.store.codeGenerator.base.requestmodel.PageModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Package Name: com.pray.example.store.codeGenerator.product.model
 * Created by Liu xi on 2019/4/22.
 * Version: V1.0
 * Des:
 */
@Setter
@Getter
public class GetCategoryProductListModel extends PageModel {
    @ApiModelProperty(value = "分类id")
    private Integer category;
}
