package com.pray.example.store.codeGenerator.base.response;

import io.swagger.annotations.ApiModelProperty;

/**
 * Package Name: com.pray.example.store.codeGenerator.base.response
 * Created by Liu xi on 2019/4/12.
 * Version: V1.0
 * Des:
 */
public class ResultResponse {
    private int code = 1;
    @ApiModelProperty(
            position = 1,
            notes = "调用说明:code<0时，是失败原因"
    )
    private String note = "";

    public ResultResponse(int code, String note) {
        this.code = code;
        this.note = note;
    }

    public ResultResponse() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
