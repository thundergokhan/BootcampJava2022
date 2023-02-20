package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.requests.technology.CreateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.technology.DeleteTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.technology.UpdateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Technologh;

public interface TechnologyService {
	void add(CreateTechnologyRequest createTechnologyRequest);

	void delete(DeleteTechnologyRequest deleteTechnologyRequest);

	void update(UpdateTechnologyRequest updateTechnologyRequest);

	List<Technologh> getAll();
}
