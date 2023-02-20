package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service // IOC
@AllArgsConstructor
public class BrandManager implements BrandService {

	private BrandRepository brandRepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<GetAllBrandsResponse> getAll() {
		List<Brand> brands = brandRepository.findAll();

		// List<GetAllBrandsResponse> response = new ArrayList<GetAllBrandsResponse>();
		// for (Brand brand : brands) {
		//     response.add(new GetAllBrandsResponse(brand.getId(), brand.getName()));
		// }

		List<GetAllBrandsResponse> brandsResponse = brands.stream()
				.map(brand -> modelMapperService.forResponse().map(brand, GetAllBrandsResponse.class))
				.collect(Collectors.toList());

		return brandsResponse;
	}

	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		Brand brand = modelMapperService.forRequest().map(createBrandRequest, Brand.class);

		brandRepository.save(brand);
	}

	@Override
	public void update(UpdateBrandRequest updateBrandRequest) {
		Brand brand = modelMapperService.forRequest().map(updateBrandRequest, Brand.class);

		brandRepository.save(brand);
	}


	@Override
	public void delete(int id) {
		brandRepository.deleteById(id);
	}

	@Override
	public GetByIdBrandResponse getById(int id) {
		Brand brand = brandRepository.findById(id).orElseThrow();
		GetByIdBrandResponse response = modelMapperService.forResponse().map(brand, GetByIdBrandResponse.class);

		return response;
	}

}
