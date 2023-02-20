package com.example.languageframework.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.languageframework.model.Language;
import com.example.languageframework.service.LanguageService;

@RestController
@RequestMapping("/languages")
public class LanguageController {
    private LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/")
    public List<Language> getAllLanguages() {
        return this.languageService.findAllLanguages();
    }

    @GetMapping("/{name}")
    public Language getLanguageByName(@PathVariable String name) {
        return this.languageService.findLanguageByName(name);
    }

    @PostMapping("/")
    public void addLanguage(@RequestBody Language language) {
        this.languageService.addLanguage(language);
    }

    @PostMapping("/{name}")
    public void deleteLanguage(@PathVariable String name) {
        this.languageService.deleteLanguage(name);
    }
}
