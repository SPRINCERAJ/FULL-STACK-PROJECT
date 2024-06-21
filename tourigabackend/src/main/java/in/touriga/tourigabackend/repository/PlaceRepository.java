package in.touriga.tourigabackend.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import in.touriga.tourigabackend.model.Place;

@Repository
public interface PlaceRepository extends MongoRepository<Place, String> {
	@Query("{'placename': ?0}")
	List<Place> findByPlace(String placename);
}