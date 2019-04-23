package com.pray.example.store.codeGenerator.base.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.enums.ApiErrorCode;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pray.example.store.codeGenerator.base.requestmodel.PageModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import static org.apache.ibatis.session.RowBounds.NO_ROW_LIMIT;
import static org.apache.ibatis.session.RowBounds.NO_ROW_OFFSET;

/**
 * Package Name: com.pray.example.store.codeGenerator.base.controller
 * Created by Liu xi on 2019/4/22.
 * Version: V1.0
 * Des:
 */
@Log4j2
public class BaseController<T> {

    @Autowired
    private IService<T> service;

    @PostMapping(value = "/getOne")
    @ApiOperation(value = "查询单条", notes = "查询单条")
    public T getOne(@ApiParam(value = "记录id") @RequestParam Integer id) {
        log.debug("1111");
        T byId = service.getById(id);
        return byId;
    }

    @PostMapping(value = "/productList", consumes = "application/json", produces = "application/json")
    @ApiOperation(value = "查询列表", notes = "查询列表")
    public IPage<T> getPageList(@ApiParam(value = "入参JSON") @RequestBody PageModel pageModel) {
        IPage<T> tiPage = queryPageData(pageModel, Wrappers.emptyWrapper());
        return tiPage;
    }

    @PostMapping(value = "/insertOne", consumes = "application/json", produces = "application/json")
    @ApiOperation(value = "插入单条", notes = "插入单条")
    public R insertOne(@ApiParam(value = "入参JSON") @RequestBody T t) {
        boolean save = service.save(t);
        R r = new R(save ? ApiErrorCode.SUCCESS : ApiErrorCode.FAILED);
        return r;
    }

    /**
     * 基础分页查询条件方法
     *
     * @param pageModel
     * @param queryWrapper
     * @return
     */
    public IPage<T> queryPageData(PageModel pageModel, Wrapper<T> queryWrapper) {
        IPage<T> page = new Page<>(NO_ROW_OFFSET, NO_ROW_LIMIT);
        if (pageModel.getPageNum() != null && pageModel.getPageSize() != null) {
            page.setCurrent(pageModel.getPageNum()).setSize(pageModel.getPageSize());
        }
        IPage<T> response = service.page(page, queryWrapper);
        return response;
    }

}
