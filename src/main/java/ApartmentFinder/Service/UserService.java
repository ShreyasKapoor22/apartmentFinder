package ApartmentFinder.Service;

import ApartmentFinder.Model.User;

import java.util.List;

public interface UserService {
	
	void addUser(User u);

	boolean validateUser(String userName, String password);


}
