package ibmtal.arabam.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.arabam.entity.Brand;

public interface BrandDao extends JpaRepository<Brand, Integer> {

}
