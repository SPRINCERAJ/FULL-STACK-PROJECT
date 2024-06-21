package in.touriga.tourigabackend.exception;

public class TourigaCollectionException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TourigaCollectionException(String message) {
		super(message);
	}
	
	public static String NotFoundException(String id) {
		return ""+id+" not found!";
	}
	
	public static String TourigaAlreadyExists() {
		return "Given Email already exists";
	}
	public static String InvalidUser() {
		return "Invalid Login!! Try Again";
	}
}
