package com.example.demofileupload.service;

import com.example.demofileupload.domain.entity.File;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {

    File upload(@RequestParam MultipartFile file);

    public File download(@RequestParam Long id);

}
