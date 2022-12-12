package ibmtal.arabam.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.arabam.business.services.BrandService;
import ibmtal.arabam.core.result.Result;
import ibmtal.arabam.dtos.BrandUpdateDto;
import ibmtal.arabam.entity.Brand;

@RestController
@RequestMapping("/api/brands")
public class BrandController {
	private BrandService brandService;
	@Autowired
	public BrandController(BrandService brandService) {
		super();
		this.brandService = brandService;
	}
	@PostMapping("/addBrand")
	@GetMapping
	public Result<Brand> addBrandApi(@RequestBody Brand brand){
		return this.brandService.addBrand(brand);
	}
	
	@PostMapping("/updateBrand")
	@GetMapping
	public Result<Brand> updateBrand(@RequestBody BrandUpdateDto brandUpdateDto){
		return this.brandService.updateBrand(brandUpdateDto);
	}
	

}
