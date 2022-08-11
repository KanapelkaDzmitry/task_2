package com.example.task_2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class DocumentService {

    private final DocumentParserService documentParserService;

    public void parseDocumentToDatabase(MultipartFile file) {
        try {
            documentParserService.parseFromDocument(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
