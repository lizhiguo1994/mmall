package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Administrator on 2018/6/26.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}