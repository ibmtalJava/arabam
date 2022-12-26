package ibmtal.arabam.business.services;

import ibmtal.arabam.core.result.Result;
import ibmtal.arabam.dtos.CarAddDto;
import ibmtal.arabam.entity.Car;

public interface CarService {
	Result<Car> getAll();
	Result<Car> addCar(CarAddDto addDto);
}
