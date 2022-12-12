package ibmtal.arabam.business.services;

import ibmtal.arabam.core.result.Result;
import ibmtal.arabam.dtos.BrandUpdateDto;
import ibmtal.arabam.entity.Brand;

public interface BrandService {
	Result<Brand> addBrand(Brand brand);
	Result<Brand> updateBrand(BrandUpdateDto brandUpdateDto);
}
