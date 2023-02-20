package repository;

import com.example.languageframework.model.Language;

import java.util.List;

public interface LanguageRepository {
    List<Language> getAllLanguages();
    Language getLanguageById(int id);
    void addLanguage(Language language);
    void updateLanguage(int id, Language language);
    void deleteLanguage(int id);
}
