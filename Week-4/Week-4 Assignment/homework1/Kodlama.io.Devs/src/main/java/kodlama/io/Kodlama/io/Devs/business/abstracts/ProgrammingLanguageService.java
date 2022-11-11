package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
    List<ProgrammingLanguage> getAll();

    void Delete(int id);

    void Add(ProgrammingLanguage programmingLanguage);

    void Update(ProgrammingLanguage programmingLanguage);

    ProgrammingLanguage GetById(int id);

}
