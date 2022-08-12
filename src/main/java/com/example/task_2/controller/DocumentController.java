package com.example.task_2.controller;

import com.example.task_2.service.DocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import static com.example.task_2.controller.DocumentController.ROOT_URL;

@RestController
@RequiredArgsConstructor
@RequestMapping(ROOT_URL)
public class DocumentController {

    public static final String ROOT_URL = "/file";

    private final DocumentService documentService;

    @GetMapping("/parse")
    public void uploadDocument(@RequestParam(value = "file") MultipartFile file) {
        documentService.parseDocumentToDatabase(file);
    }
}