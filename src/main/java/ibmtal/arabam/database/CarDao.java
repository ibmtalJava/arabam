package ibmtal.arabam.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.arabam.entity.Car;

public interface CarDao extends JpaRepository<Car, Integer> {

}
