package com.example.languageframework.service;

import java.util.ArrayList;
import java.util.List;

import com.example.languageframework.model.Language;

public class LanguageService {
    private List<Language> languages;

    public LanguageService() {
        this.languages = new ArrayList<>();
        this.languages.add(new Language("English", "en"));
        this.languages.add(new Language("Turkish", "tr"));
        this.languages.add(new Language("Spanish", "es"));
    }

    public List<Language> findAllLanguages() {
        return this.languages;
    }

    public Language findLanguageByName(String name) {
        for (Language language : this.languages) {
            if (language.getName().equalsIgnoreCase(name)) {
                return language;
            }
        }
        return null;
    }

    public Language findLanguageByCode(String code) {
        for (Language language : this.languages) {
            if (language.getLanguage().equalsIgnoreCase(code)) {
                return language;
            }
        }
        return null;
    }

    public void addLanguage(Language language) {
        this.languages.add(language);
    }

    public void deleteLanguage(String name) {
        Language language = findLanguageByName(name);
        if (language != null) {
            this.languages.remove(language);
        }
    }
}
