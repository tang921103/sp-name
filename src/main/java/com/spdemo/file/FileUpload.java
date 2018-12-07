package com.spdemo.file;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

@Controller
public class FileUpload {
    @Value("${file.path}")
    private String fileBasePath;
    @RequestMapping("/upLoadFile")
    @ResponseBody
    public String getFile(MultipartFile file) throws IOException {
        System.out.println(file.getName());
        String extName =  file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String newName = UUID.randomUUID().toString()+extName;
        File f = new File(fileBasePath);
        if(!f.exists()){
            f.mkdir();
        }
        FileCopyUtils.copy(file.getInputStream(),new FileOutputStream(new File(fileBasePath+"/"+newName)));
        return  fileBasePath+newName;
    }
}
