package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository extends JpaRepository<Language, Integer>{
	public Language getByName(String name);
	
}