package ibmtal.arabam.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.arabam.business.services.CarService;
import ibmtal.arabam.core.result.Result;
import ibmtal.arabam.database.BrandDao;
import ibmtal.arabam.database.CarDao;
import ibmtal.arabam.dtos.CarAddDto;
import ibmtal.arabam.entity.Car;
@Service
public class CarManager implements CarService {
	private CarDao carDao;
	private BrandDao brandDao;
	@Autowired
	public CarManager(CarDao carDao,BrandDao brandDao) {
		super();
		this.carDao = carDao;
		this.brandDao=brandDao;
	}

	@Override
	public Result<Car> getAll() {
		Result<Car> result=new Result<>();
		result.setData(new ArrayList<Car>(this.carDao.findAll()));
		return result;
	}

	@Override
	public Result<Car> addCar(CarAddDto addDto) {
		Result<Car> result=new Result<>();
		if(this.brandDao.findById(addDto.getBrand()).isEmpty()) {
			result.newError("brand","Marka kaydı bulunamadı");
		}
		if(addDto.getName().isBlank()) {
			result.newError("name","Araba adını boş geçemezsiniz");
		}
		if(result.isSuccess()) {
			Car car=new Car();
			car.setName(addDto.getName());
			car.setPrice(addDto.getPrice());
			car.setBrand(this.brandDao.findById(addDto.getBrand()).get());
			this.carDao.save(car);
			result.getData().add(car);
		}
		return result;
	}
	
}
