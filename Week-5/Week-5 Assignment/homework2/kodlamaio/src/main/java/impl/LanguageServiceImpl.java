package impl;

import com.example.languageframework.model.Language;
import com.example.languageframework.repository.LanguageRepository;
import com.example.languageframework.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    LanguageRepository languageRepository;

    @Override
    public List<Language> getAllLanguages() {
        return languageRepository.getAllLanguages();
    }

    @Override
    public Language getLanguageById(int id) {
        return languageRepository.getLanguageById(id);
    }

    @Override
    public void addLanguage(Language language) {
        languageRepository.addLanguage(language);
    }

    @Override
    public void updateLanguage(int id, Language language) {
        languageRepository.updateLanguage(id, language);
    }

    @Override
    public void deleteLanguage(int id) {
        languageRepository.deleteLanguage(id);
    }
}
