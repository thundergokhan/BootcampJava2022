package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    private ProgrammingLanguageRepository programmingLanguageRepository;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }


    @Override
    public List<ProgrammingLanguage> getAll() {

        return programmingLanguageRepository.getAll();
    }


    @Override
    public void Delete(int id) {
        programmingLanguageRepository.Delete(id);
    }


    @Override
    public void Add(ProgrammingLanguage programmingLanguage) {
        programmingLanguageRepository.Add(programmingLanguage);

    }


    @Override
    public void Update(ProgrammingLanguage programmingLanguage) {
        programmingLanguageRepository.Update(programmingLanguage);

    }


    @Override
    public ProgrammingLanguage GetById(int id) {
        return programmingLanguageRepository.GetById(id);
    }

}
