package com.example.task_2.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface DocumentParserService {

    Map<Integer, List<String>> parseFromDocument(MultipartFile file) throws IOException;

    void uploadToFail(Map<Integer, List<String>> value);
}
