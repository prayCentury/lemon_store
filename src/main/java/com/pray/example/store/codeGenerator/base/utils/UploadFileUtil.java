package com.pray.example.store.codeGenerator.base.utils;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Package Name: com.pray.example.store.codeGenerator.base.utils
 * Created by Liu xi on 2019/4/23.
 * Version: V1.0
 * Des:
 */
@Component
public class UploadFileUtil {

    public static void uploadPic(MultipartFile file) {
        try {
            file.transferTo(new File("D:\\pray\\soft_dev\\static\\image\\" + file.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
