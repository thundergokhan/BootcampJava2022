package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.business.requests.language.CreateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.language.DeleteLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.language.UpdateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;

	}

	@Override
	public List<Language> getAll() {

		return this.languageRepository.findAll();
	}

	@Override
	public void addLanguage(CreateLanguageRequest createLanguageRequest) {
		Language languages = new Language();
		languages.setName(createLanguageRequest.getName());
		if (createLanguageRequest.getName() == "") {
			System.out.println("Programlama dilinin ismi boş olamaz.");
		} else if (this.languageRepository.getByName(createLanguageRequest.getName()) == null) {
			System.out.println("Bu isimde programlama dili mevcut.");
		}

		this.languageRepository.save(languages);
	}

	@Override
	public void deleteLanguage(DeleteLanguageRequest deleteLanguageRequest) {
		this.languageRepository.deleteById(deleteLanguageRequest.getId());

	}

	@Override
	public void updateLanguage(UpdateLanguageRequest updateLanguageRequest) {
		@SuppressWarnings("deprecation")
		Language language = this.languageRepository.getById(updateLanguageRequest.getId());
		language.setName(updateLanguageRequest.getName());
		this.languageRepository.save(language);

	}

}