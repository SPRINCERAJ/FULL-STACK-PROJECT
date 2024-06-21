package in.touriga.tourigabackend.service;

import java.util.List;
import java.util.Optional;

import in.touriga.tourigabackend.exception.TourigaCollectionException;
import in.touriga.tourigabackend.model.User;
import in.touriga.tourigabackend.model.Package;
import in.touriga.tourigabackend.model.Place;
import in.touriga.tourigabackend.model.Booking;

public interface TourigaService {
	void createUser(User user) throws TourigaCollectionException;
	User loginUser(String emailid, String password) throws TourigaCollectionException;
	List<Package> getPackagedetails(String placename) throws TourigaCollectionException;
	List<Place> getPlacedetails(String placename) throws TourigaCollectionException;
	void bookTrip(Booking book) throws TourigaCollectionException;
	public void deleteBookingById(String id) throws TourigaCollectionException;
	List<Package> getPackagedetailsbyid(String packageid) throws TourigaCollectionException;
	Optional<Booking> getBookingdetailsbyid(String bookingid) throws TourigaCollectionException;
	Optional<Booking> getBookingdetailsbypackid(String packageidid) throws TourigaCollectionException;
}
