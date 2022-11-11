package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
    List<ProgrammingLanguage> getAll();

    void Add(ProgrammingLanguage programmingLanguage);

    void Delete(int id);

    void Update(ProgrammingLanguage programmingLanguage);

    ProgrammingLanguage GetById(int id);

}
