package com.pray.example.store.codeGenerator.base.response;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Package Name: com.pray.example.store.codeGenerator.base.response
 * Created by Liu xi on 2019/4/12.
 * Version: V1.0
 * Des:
 */
public class ListResultResponse<T> extends ResultResponse {

    @ApiModelProperty(
            position = 2,
            notes = "业务数据"
    )
    private List<T> records;
    @ApiModelProperty(
            position = 3,
            notes = "每页数:在分页查询中有用"
    )
    private long pageSize = -1L;
    @ApiModelProperty(
            position = 4,
            notes = "当前页:在分页查询中有用"
    )
    private long currentPage = -1L;
    @ApiModelProperty(
            position = 5,
            notes = "总记录数:在分页查询中有用"
    )
    private long totalRecord = -1L;
    @ApiModelProperty(
            position = 5,
            notes = "总页数:在分页查询中有用"
    )
    private long totalPage = -1L;

    public ListResultResponse(int code, String note) {
        super(code, note);
    }

    public ListResultResponse() {

    }

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public long getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(long currentPage) {
        this.currentPage = currentPage;
    }

    public long getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(long totalRecord) {
        this.totalRecord = totalRecord;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }
}
