package in.touriga.tourigabackend.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import in.touriga.tourigabackend.model.Booking;

@Repository
public interface BookingRepository extends MongoRepository<Booking, String> {
	
	@Query("{'userid': ?0}")
	Optional<Booking> findById(String userid);
	@Query("{'packageid': ?0}")
	Optional<Booking> findByPackageId(String packageid);
	
}