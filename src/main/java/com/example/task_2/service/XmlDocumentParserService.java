package com.example.task_2.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class XmlDocumentParserService implements DocumentParserService{

    @Override
    public Map<Integer, List<String>> parseFromDocument(MultipartFile file) throws IOException {
        Workbook workbook = new HSSFWorkbook(file.getInputStream());





        return Map.of(null, null);
    }

    @Override
    public void uploadToFail(Map<Integer, List<String>> value) {

    }
}
