package com.example.pfev2.controllers;


import com.example.pfev2.entites.Document;
import com.example.pfev2.repositorys.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/documents")
public class DocumentController {

    @Autowired
    private DocumentRepository documentRepository;

    @GetMapping
    public List<Document> getAllDocuments() {
        return documentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Document getDocumentById(@PathVariable Long id) {
        return documentRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public Document createDocument(@RequestBody Document document) {
        return documentRepository.save(document);
    }

    @PutMapping("/{id}")
    public Document updateDocument(@PathVariable Long id, @RequestBody Document document) {
        document.setId(id);
        return documentRepository.save(document);
    }

    @DeleteMapping("/{id}")
    public void deleteDocument(@PathVariable Long id) {
        documentRepository.deleteById(id);
    }
}