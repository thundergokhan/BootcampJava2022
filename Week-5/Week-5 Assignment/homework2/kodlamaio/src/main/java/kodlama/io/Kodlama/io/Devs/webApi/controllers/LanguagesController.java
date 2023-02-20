package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.business.requests.language.CreateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.language.DeleteLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.language.UpdateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public List<Language> getall() {
		return languageService.getAll();

	}

	@PostMapping("/add")
	public void add(CreateLanguageRequest createLanguageRequest){
		languageService.addLanguage(createLanguageRequest);
	}
	
	@DeleteMapping("/deleteLanguage/{id}")
    public void deleteLanguage(DeleteLanguageRequest deleteLanguageRequest){
        languageService.deleteLanguage(deleteLanguageRequest);
    }
	 
	 @PutMapping("/update")
	    public void updateLanguage(UpdateLanguageRequest updateLanguageRequest) {
	        languageService.updateLanguage(updateLanguageRequest);
	    }
}