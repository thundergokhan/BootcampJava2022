package impl;

import com.example.languageframework.model.Language;
import com.example.languageframework.repository.LanguageRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LanguageRepositoryImpl implements LanguageRepository {

    private List<Language> languages = new ArrayList<>();
    private int nextId = 1;

    @Override
    public List<Language> getAllLanguages() {
        return languages;
    }

    @Override
    public Language getLanguageById(int id) {
        for (Language language : languages) {
            if (language.getId() == id) {
                return language;
            }
        }
        return null;
    }

    @Override
    public void addLanguage(Language language) {
        language.setId(nextId++);
        languages.add(language);
    }

    @Override
    public void updateLanguage(int id, Language language) {
        Language foundLanguage = getLanguageById(id);
        if (foundLanguage != null) {
            foundLanguage.setName(language.getName());
            foundLanguage.setTechnologies(language.getTechnologies());
        }
    }

    @Override
    public void deleteLanguage(int id) {
        Language foundLanguage = getLanguageById(id);
        if (foundLanguage != null) {
            languages.remove(foundLanguage);
        }
    }
}
