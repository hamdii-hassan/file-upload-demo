package com.example.demofileupload.controller;

import com.example.demofileupload.domain.entity.File;
import com.example.demofileupload.domain.repository.FileRepo;
import com.example.demofileupload.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Base64;

@RestController
@RequestMapping("api/files")
public class FileController {

    @Autowired @Qualifier("v1")
    private FileService fileService;


    @PostMapping("/upload")
    public File upload(@RequestParam MultipartFile file){
        try {
            return fileService.upload(file);
        }
        catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @GetMapping("/download")
    public File download(@RequestParam Long id){
        return fileService.download(id);
    }
}
