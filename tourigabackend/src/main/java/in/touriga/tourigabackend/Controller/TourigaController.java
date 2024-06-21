package in.touriga.tourigabackend.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.touriga.tourigabackend.exception.TourigaCollectionException;
import in.touriga.tourigabackend.model.Booking;
import in.touriga.tourigabackend.model.User;
import in.touriga.tourigabackend.service.TourigaService;
import jakarta.validation.ConstraintViolationException;

@CrossOrigin
@RestController
public class TourigaController {
	@Autowired
	private TourigaService tourigaService;
	
	@GetMapping("/getpackage/{placename}")
	public ResponseEntity<?> getPacakages(@PathVariable("placename") String placename){
		try {
			return new ResponseEntity<>(tourigaService.getPackagedetails(placename), HttpStatus.OK);
		} catch (TourigaCollectionException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/getpackagebyid/{packageid}")
	public ResponseEntity<?> getPacakagesbyid(@PathVariable("packageid") String packageid){
		try {
			return new ResponseEntity<>(tourigaService.getPackagedetailsbyid(packageid), HttpStatus.OK);
		} catch (TourigaCollectionException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	
	@GetMapping("/booking/{userid}")
	public ResponseEntity<?> getBookingsbyid(@PathVariable("userid") String userid){
		try {
			return new ResponseEntity<>(tourigaService.getBookingdetailsbyid(userid), HttpStatus.OK);
		} catch (TourigaCollectionException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	
	@GetMapping("/getplace/{placename}")
	public ResponseEntity<?> getPlaces(@PathVariable("placename") String placename){
		try {
			return new ResponseEntity<>(tourigaService.getPlacedetails(placename), HttpStatus.OK);
		} catch (TourigaCollectionException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/signup")
	public ResponseEntity<?> createSignup(@RequestBody User user) {
		try {
			tourigaService.createUser(user);
			return new ResponseEntity<User>(user, HttpStatus.OK);
		}catch (ConstraintViolationException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY); }
		catch (TourigaCollectionException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
		}
	}
	
	@PostMapping("/booking")
	public ResponseEntity<?> bookingTrip(@RequestBody Booking book) {
		try {
			tourigaService.bookTrip(book);
			return new ResponseEntity<Booking>(book, HttpStatus.OK);
		}catch (ConstraintViolationException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY); }
		catch (TourigaCollectionException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
		}
	}
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        try {
            User loggedInUser = tourigaService.loginUser(loginRequest.getEmailid(), loginRequest.getPassword());
            return ResponseEntity.ok(loggedInUser);
        } catch (TourigaCollectionException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
        }
    }
    
	@DeleteMapping("/booking/{id}")
	public ResponseEntity<?> deleteById(@PathVariable("id") String id) throws TourigaCollectionException{
		try
		{
            tourigaService.deleteBookingById(id);
            return new ResponseEntity<>("Successfully deleted todo with id "+id, HttpStatus.OK);
        }
        catch (TourigaCollectionException e)
        {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }	
	}

    // Inner class representing login request structure
    static class LoginRequest {
        private String emailid;
        private String password;

        // Getters and setters
        public String getEmailid() {
            return emailid;
        }

        public void setEmailid(String emailid) {
            this.emailid = emailid;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}