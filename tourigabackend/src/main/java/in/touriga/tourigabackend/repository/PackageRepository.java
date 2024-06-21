package in.touriga.tourigabackend.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import in.touriga.tourigabackend.model.Package;

@Repository
public interface PackageRepository extends MongoRepository<Package, String> {
	
	@Query("{'placename': ?0}")
	List<Package> findByPlace(String placename);
}