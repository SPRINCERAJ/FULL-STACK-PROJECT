package in.touriga.tourigabackend.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import in.touriga.tourigabackend.model.Package;

@Repository
public interface PackageidRepository extends MongoRepository<Package, String> {
	
	@Query("{'packageid': ?0}")
	List<Package> findByPackId(String packageid);
}