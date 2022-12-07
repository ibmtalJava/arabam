package ibmtal.arabam.business.services;

import ibmtal.arabam.core.result.Result;
import ibmtal.arabam.entity.Brand;

public interface BrandService {
	Result<Brand> addBrand(Brand brand);
}
