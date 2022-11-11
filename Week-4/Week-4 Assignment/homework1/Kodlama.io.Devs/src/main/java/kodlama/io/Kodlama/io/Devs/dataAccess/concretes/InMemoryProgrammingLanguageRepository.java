package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

    List<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingLanguageRepository() {
        programmingLanguages = new ArrayList<ProgrammingLanguage>();
        programmingLanguages.add(new ProgrammingLanguage(1, "Java"));
        programmingLanguages.add(new ProgrammingLanguage(2, "Python"));
        programmingLanguages.add(new ProgrammingLanguage(3, "C#"));
        programmingLanguages.add(new ProgrammingLanguage(4, "PHP"));
    }

    @Override
    public List<ProgrammingLanguage> getAll() {

        return programmingLanguages;
    }

    @Override
    public void Delete(int id) {
        programmingLanguages.remove(id - 1);

    }

    @Override
    public void Add(ProgrammingLanguage programmingLanguage) {
        boolean isExist = false;
        if (programmingLanguage.getName() != null && !(programmingLanguage.getName().isEmpty()) && !(programmingLanguage.getName().isBlank())) {
            for (ProgrammingLanguage language : programmingLanguages) {
                if (language.getName().matches(programmingLanguage.getName())) {
                    isExist = true;
                }
            }
            if (isExist == false) {
                programmingLanguages.add(programmingLanguage);
            }
        }

    }

    @Override
    public void Update(ProgrammingLanguage programmingLanguage) {
        for (ProgrammingLanguage language : programmingLanguages) {
            if (language.getId() == programmingLanguage.getId()) {
                language.setName(programmingLanguage.getName());
            }
        }

    }

    @Override
    public ProgrammingLanguage GetById(int id) {
        return programmingLanguages.get(id);
    }

}
