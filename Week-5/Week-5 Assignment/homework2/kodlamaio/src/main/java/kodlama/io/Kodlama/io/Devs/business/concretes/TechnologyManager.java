package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Kodlama.io.Devs.business.requests.technology.CreateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.technology.DeleteTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.technology.UpdateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Technologh;

@Service
public class TechnologyManager implements TechnologyService{

private TechnologyRepository technologyRepository;
	
	@Autowired
	public TechnologyManager(TechnologyRepository technologyRepository) {
		this.technologyRepository = technologyRepository;
	}

	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) {
		Technologh technology = new Technologh();
		technology.setName(createTechnologyRequest.getName());
		this.technologyRepository.save(technology);
		
	}

	@Override
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
		@SuppressWarnings("deprecation")
		var technologyToDelete = this.technologyRepository.getById(deleteTechnologyRequest.getId());
		this.technologyRepository.delete(technologyToDelete);
		
	}

	@Override
	public void update(UpdateTechnologyRequest updateTechnologyRequest) {
		@SuppressWarnings("deprecation")
		var technologyToUpdate = this.technologyRepository.getById(updateTechnologyRequest.getId());
		technologyToUpdate.setName(updateTechnologyRequest.getName());
		this.technologyRepository.save(technologyToUpdate);
		
	}

	@Override
	public List<Technologh> getAll() {
		return this.technologyRepository.findAll();
	}

}