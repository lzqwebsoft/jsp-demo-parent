package com.dip.entity;

/**
 * Created by moneg on 06.01.2017.
 */import org.springframework.web.multipart.MultipartFile;

public class FileUpload {

    MultipartFile file;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
