package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.requests.language.CreateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.language.DeleteLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.language.UpdateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();

	void addLanguage(CreateLanguageRequest createLanguageRequest);

	void deleteLanguage(DeleteLanguageRequest deleteLanguageRequest);

	void updateLanguage(UpdateLanguageRequest updateLanguageRequest);
}