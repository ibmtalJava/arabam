package ibmtal.arabam.business.services;

import ibmtal.arabam.core.result.Result;
import ibmtal.arabam.entity.Car;

public interface CarService {
	Result<Car> getAll();
}
