package com.example.datong.util;

import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class FileUtil {
    public static String savePhoto(MultipartFile file) {
        try {
            if (file != null) {
                String hz = file.getOriginalFilename();
                Date date = new Date(System.currentTimeMillis());
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
                String name = simpleDateFormat.format(date);
                String path = ResourceUtils.getURL("classpath:").getPath() + "static/file/";
                if (hz.endsWith(".jpg")||hz.endsWith(".jpeg")){
                    path += name + ".jpg";
                    name+=".jpg";
                }else if(hz.endsWith(".png")) {
                    path += name + ".png";
                    name += ".png";
                }
                File newFile = new File(path);
                if(!newFile.getParentFile().exists()){
                    newFile.mkdirs();
                }
                file.transferTo(newFile);
                return name;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
