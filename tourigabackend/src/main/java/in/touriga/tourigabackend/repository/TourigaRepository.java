package in.touriga.tourigabackend.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import in.touriga.tourigabackend.model.User;

@Repository
public interface TourigaRepository extends MongoRepository<User, String> {
	
	@Query("{'emailid': ?0}")
	Optional<User> findByEmail(String emailid);
}