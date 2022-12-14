package ibmtal.arabam.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.arabam.business.services.CarService;
import ibmtal.arabam.core.result.Result;
import ibmtal.arabam.database.CarDao;
import ibmtal.arabam.entity.Car;
@Service
public class CarManager implements CarService {
	private CarDao carDao;
	
	@Autowired
	public CarManager(CarDao carDao) {
		super();
		this.carDao = carDao;
	}

	@Override
	public Result<Car> getAll() {
		Result<Car> result=new Result<>();
		result.setData(new ArrayList<Car>(this.carDao.findAll()));
		return result;
	}
	
}
