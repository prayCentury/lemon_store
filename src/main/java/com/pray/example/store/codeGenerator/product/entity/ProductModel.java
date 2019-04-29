package com.pray.example.store.codeGenerator.product.entity;

import java.math.BigDecimal;
import com.pray.example.store.codeGenerator.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import static com.pray.example.store.codeGenerator.base.utils.DateFormatterUtil.DateFormatterUtil;

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
@TableName("product")
@ApiModel(value="ProductModel对象", description="")
public class ProductModel extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品名称")
    @TableField("proName")
    private String proName;

    @ApiModelProperty(value = "分类id")
    @TableField("categoryId")
    private Integer categoryId;

    @ApiModelProperty(value = "商品介绍")
    @TableField("contentDescribe")
    private String contentDescribe;

    private BigDecimal price;

    @ApiModelProperty(value = "上架日期")
    @TableField("bookDate")
    private LocalDateTime bookDate;

    @ApiModelProperty(value = "是否新上0否/1是")
    @TableField("isNew")
    private Integer isNew;
    @ApiModelProperty(value = "是否新上0否/1是")
    @TableField("picUrl")
    private String picUrl;

    public String getBookDate() {
        return DateFormatterUtil(bookDate);
    }

    public void setBookDate(LocalDateTime bookDate) {
        this.bookDate = bookDate;
    }
}
