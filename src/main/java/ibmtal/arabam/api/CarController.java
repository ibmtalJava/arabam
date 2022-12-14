package ibmtal.arabam.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.arabam.business.services.CarService;
import ibmtal.arabam.core.result.Result;
import ibmtal.arabam.entity.Car;

@RestController
@RequestMapping("/api/cars")
public class CarController {
	private CarService carService;
	@Autowired
	public CarController(CarService carService) {
		super();
		this.carService = carService;
	}

	@GetMapping("/getAll")
	public Result<Car> getAll(){
		return this.carService.getAll();
	}
}
