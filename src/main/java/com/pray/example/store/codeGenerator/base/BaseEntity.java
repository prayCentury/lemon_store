package com.pray.example.store.codeGenerator.base;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Package Name: com.pray.example.store.codeGenerator.base
 * Created by Liu xi on 2019/4/12.
 * Version: V1.0
 * Des:
 */
@Data
public class BaseEntity {
    /**
     * id
     */
    @ApiModelProperty(
            position = 0,
            notes = "id"
    )
    @TableId(type = IdType.INPUT)
    private Integer id;
}
