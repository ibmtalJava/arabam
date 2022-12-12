package ibmtal.arabam.business.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.arabam.business.services.BrandService;
import ibmtal.arabam.core.result.Result;
import ibmtal.arabam.database.BrandDao;
import ibmtal.arabam.dtos.BrandUpdateDto;
import ibmtal.arabam.entity.Brand;
@Service
public class BrandManager implements BrandService {
	private BrandDao brandDao;
	@Autowired
	public BrandManager(BrandDao brandDao) {
		this.brandDao = brandDao;
	}
	@Override
	public Result<Brand> addBrand(Brand brand) {
		Result<Brand> result=new Result<>();
		if(brand.getName().isEmpty()) {
			result.newError("name","Boş geçilemez");
		}
		if(brand.getName().length()>30) {
			result.newError("name", "30 Karakterden fazla olamaz");
		}
		if(result.isSuccess()) {
			this.brandDao.save(brand);
			result.getData().add(brand);
		}
		return result;
	}
	@Override
	public Result<Brand> updateBrand(BrandUpdateDto brandUpdateDto) {
		Result<Brand> result=new Result<>();
		Brand brand=new Brand();
		if(this.brandDao.findById(brandUpdateDto.getId()).isEmpty()) {
			result.newError("id","id numarasına ait Marka Bulunamadı");
		}
		if(result.isSuccess()==true) {
			brand=this.brandDao.findById(brandUpdateDto.getId()).get();
			brand.setName(brandUpdateDto.getName());
			brand.setLogo(brandUpdateDto.getLogo());
			this.brandDao.save(brand);
			result.getData().add(brand);	
		}
		return result;
	}
	
	
}
