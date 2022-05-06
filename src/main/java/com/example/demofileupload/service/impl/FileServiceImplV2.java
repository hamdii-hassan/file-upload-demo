package com.example.demofileupload.service.impl;

import com.example.demofileupload.domain.entity.File;
import com.example.demofileupload.domain.repository.FileRepo;
import com.example.demofileupload.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * Save file in locally and store URL in database
 */

@Service("v2")
public class FileServiceImplV2 implements FileService {

    @Autowired
    private FileRepo fileRepo;

    @Override
    public File upload(MultipartFile file) {
        return null;
    }

    @Override
    public File download(Long id) {
        return null;
    }
}
