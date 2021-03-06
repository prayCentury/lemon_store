package com.pray.example.store.codeGenerator.product.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.R;
import com.pray.example.store.codeGenerator.base.controller.BaseController;
import com.pray.example.store.codeGenerator.base.utils.UploadFileUtil;
import com.pray.example.store.codeGenerator.product.entity.ProductModel;
import com.pray.example.store.codeGenerator.product.model.GetCategoryProductListModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author pray
 * @since 2019-04-22
 */
@RestController
@RequestMapping("/product")
public class ProductController extends BaseController<ProductModel> {

    @PostMapping(value = "/getCategoryProductList", consumes = "application/json", produces = "application/json")
    @ApiOperation(value = "查询分类产品列表", notes = "查询分类产品列表")
    public IPage<ProductModel> getCategoryProductList(@ApiParam(value = "入参JSON") @RequestBody GetCategoryProductListModel pageModel) {
        QueryWrapper<ProductModel> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(pageModel.getCategory() != null, "categoryId", pageModel.getCategory());
        IPage<ProductModel> tiPage = queryPageData(pageModel, queryWrapper);
        return tiPage;
    }

    @PostMapping(value = "/uploadPic")
    @ApiOperation(value = "上传图片", notes = "上传图片", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void cusGroupImport(@ApiParam(value = "入参JSON") ProductModel productModel,
                               @RequestParam(value = "file", required = false) MultipartFile file) {
        UploadFileUtil.uploadPic(file);
    }
}

