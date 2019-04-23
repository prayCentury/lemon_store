package com.pray.example.store.codeGenerator.base.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Package Name: com.pray.example.store.codeGenerator.base.utils
 * Created by Liu xi on 2019/4/22.
 * Version: V1.0
 * Des:
 */
public class DateFormatterUtil {

    public static String DateFormatterUtil(LocalDateTime date) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return df.format(date);
    }

}
