package com.example.task_2.service;

import com.example.task_2.entity.Document;
import com.example.task_2.repository.DocumentRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class DocumentService {

    private final DocumentParserService documentParserService;
    private final DocumentRepository documentRepository;

    @SneakyThrows
    public void saveDocumentToDatabase(MultipartFile file) {
        Document document = documentParserService.createDocument(file);
        documentRepository.save(document);
    }
}
