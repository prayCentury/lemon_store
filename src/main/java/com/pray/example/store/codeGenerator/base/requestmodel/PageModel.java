package com.pray.example.store.codeGenerator.base.requestmodel;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

/**
 * Package Name: com.pray.example.store.codeGenerator.base
 * Created by Liu xi on 2019/4/12.
 * Version: V1.0
 * Des:
 */
@Setter
@Getter
public class PageModel {
    private Integer pageNum;
    private Integer pageSize;
}
