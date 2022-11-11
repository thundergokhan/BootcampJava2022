package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}

	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageService.getAll();
	}
	
	@DeleteMapping("delete/{id}")
	public void Delete(int id) {
		programmingLanguageService.Delete(id-1);
	}
	
	@PostMapping("/add")
	public void Add(ProgrammingLanguage programmingLanguage) {
		programmingLanguageService.Add(programmingLanguage);
	}
	@PutMapping("/update")
	public void Update(ProgrammingLanguage programmingLanguage) {
		programmingLanguageService.Update(programmingLanguage);
	}
	
	@GetMapping("/getbyid/{id}")
	public ProgrammingLanguage GetById(int id) {
		return programmingLanguageService.GetById(id-1);
	}

}
