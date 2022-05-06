package com.example.demofileupload.service.impl;

import com.example.demofileupload.domain.entity.File;
import com.example.demofileupload.domain.repository.FileRepo;
import com.example.demofileupload.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.Base64;

/**
 ** Save file in database (convert to base64)
 ** useful only for small files
 */

@Service("v1")
public class FileServiceImplV1 implements FileService{

    @Autowired
    private FileRepo fileRepo;

    @Override
    public File upload(@RequestParam MultipartFile file){
        try {
            byte[] bytes = file.getBytes();
            String base64File = String.format("data:%s;base64,%s", file.getContentType(), Base64.getEncoder().encodeToString(bytes));
            return fileRepo.save(File.builder()
                    .content(base64File)
                    .type(file.getContentType())
                    .size(file.getSize())
                    .url("*")
                    .build());
        }
        catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
    @Override
    public File download(@RequestParam Long id){
        return fileRepo.findById(id).orElseThrow(() -> new RuntimeException("File Not Found !"));
    }
}
