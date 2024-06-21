package in.touriga.tourigabackend.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.touriga.tourigabackend.exception.TourigaCollectionException;
import in.touriga.tourigabackend.model.Booking;
import in.touriga.tourigabackend.model.Package;
import in.touriga.tourigabackend.model.Place;
import in.touriga.tourigabackend.model.User;
import in.touriga.tourigabackend.repository.BookingRepository;
import in.touriga.tourigabackend.repository.PackageRepository;
import in.touriga.tourigabackend.repository.PackageidRepository;
import in.touriga.tourigabackend.repository.PlaceRepository;
import in.touriga.tourigabackend.repository.TourigaRepository;

@Service
public class TourigaServiceImple implements TourigaService {

	@Autowired
	private TourigaRepository tourigaRepo;
	
	@Autowired
	private PackageRepository packageRepo;
	
	
	@Autowired
	private PackageidRepository packageidRepo;
	
	@Autowired
	private PlaceRepository placeRepo;
	
	@Autowired
	private BookingRepository bookingRepo;
	
	/*
	@Override
	public List<TodoDTO> getAllTodos() {
		List<TodoDTO> todos = todoRepo.findAll();
		if (todos.size() > 0) {
			return todos;
		}else {
			return new ArrayList<TodoDTO>();
		}
	}

	@Override
	public TodoDTO getSingleTodo(String id) throws TodoCollectionException{
		Optional<TodoDTO> todoOptional = todoRepo.findById(id);
		if (!todoOptional.isPresent()) {
			throw new TodoCollectionException(TodoCollectionException.NotFoundException(id));
		}else {
			return todoOptional.get();
		}
	}
*/	
	@Override
	public void createUser(User user) throws TourigaCollectionException{
		Optional<User> tourigaOptional= tourigaRepo.findByEmail(user.getEmailid());
		System.out.println(tourigaOptional);
        if(tourigaOptional.isPresent())
        {
            throw new TourigaCollectionException(TourigaCollectionException.TourigaAlreadyExists());
        }
        else
        {
            tourigaRepo.save(user);
        }
    }
	
	@Override
	public void bookTrip(Booking book) throws TourigaCollectionException{
		Optional<Booking> tourigaOptional= bookingRepo.findById(book.getBookingid());
		System.out.println(tourigaOptional);
        if(tourigaOptional.isPresent())
        {
            throw new TourigaCollectionException(TourigaCollectionException.TourigaAlreadyExists());
        }
        else
        {
            bookingRepo.save(book);
        }
    }
	  
    @Override
    public User loginUser(String emailid, String password) throws TourigaCollectionException {
        User user = tourigaRepo.findByEmail(emailid)
                .orElseThrow(() -> new TourigaCollectionException("User not found."));

        if (!user.getPassword().equals(password)) {
            throw new TourigaCollectionException("Invalid password.");
        }

        return user;
    }
    
    
    
    
	@Override
	public void deleteBookingById(String id) throws TourigaCollectionException{
		Optional<Booking> todoOptional = bookingRepo.findById(id);
        if(!todoOptional.isPresent())
        {
            throw new TourigaCollectionException(TourigaCollectionException.NotFoundException(id));
        }
        else
        {
            bookingRepo.deleteById(id);
        }																				
	}
    @Override
    public List<Package> getPackagedetails(String placename) throws TourigaCollectionException {
        List<Package> res_packs = packageRepo.findByPlace(placename);
        if (res_packs.isEmpty()) {
            throw new TourigaCollectionException(TourigaCollectionException.NotFoundException(placename));
        } else {
            return res_packs;
        }
    }
    
    
    @Override
    public List<Package> getPackagedetailsbyid(String packageid) throws TourigaCollectionException {
        List<Package> res_packs = packageidRepo.findByPackId(packageid);
        if (res_packs.isEmpty()) {
            throw new TourigaCollectionException(TourigaCollectionException.NotFoundException(packageid));
        } else {
            return res_packs;
        }
    }

    
    
    @Override
    public Optional<Booking> getBookingdetailsbyid(String userid) throws TourigaCollectionException {
        Optional<Booking> res_books = bookingRepo.findById(userid);
        if (res_books.isEmpty()) {
            throw new TourigaCollectionException(TourigaCollectionException.NotFoundException(userid));
        } else {
            return res_books;
        }
    }
    @Override
    public List<Place> getPlacedetails(String placename) throws TourigaCollectionException {
        List<Place> res_packs = placeRepo.findByPlace(placename);
        if (res_packs.isEmpty()) {
            throw new TourigaCollectionException(TourigaCollectionException.NotFoundException(placename));
        } else {
            return res_packs;
        }
    }
	/*@Override
	public void updateTodo(String id, User user) throws TodoCollectionException{
		Optional<TodoDTO> todoWithId = todoRepo.findById(id);
        Optional<TodoDTO> todoWithSameName = todoRepo.findByTodo(todo.getTodo());
        if(todoWithId.isPresent())
        {
            if(todoWithSameName.isPresent() && !todoWithSameName.get().getId().equals(id))
            {

                throw new TodoCollectionException(TodoCollectionException.TodoAlreadyExists());
            }
            User userToUpdate=todoWithId.get();
            
            todoToUpdate.setTodo(todo.getTodo());
            todoToUpdate.setDescription(todo.getDescription());
            todoToUpdate.setCompleted(todo.getCompleted());
            todoToUpdate.setUpdatedAt(new Date(System.currentTimeMillis()));
            todoRepo.save(todoToUpdate);
        }
        else
        {
            throw new TodoCollectionException(TodoCollectionException.NotFoundException(id));
        }
	}

	@Override
	public void deleteTodoById(String id) throws TodoCollectionException{
		Optional<TodoDTO> todoOptional = todoRepo.findById(id);
        if(!todoOptional.isPresent())
        {
            throw new TodoCollectionException(TodoCollectionException.NotFoundException(id));
        }
        else
        {
            todoRepo.deleteById(id);
        }
		
	}*/
}
