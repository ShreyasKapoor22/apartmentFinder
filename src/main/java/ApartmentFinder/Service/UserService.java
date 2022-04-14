package ApartmentFinder.Service;

import ApartmentFinder.Model.User;

import java.util.List;

public interface UserService {
	
	void addUser(User u);

	User validateUser(String userName, String password);

	boolean ifUserNameExists(String userName);

	User getUserDetails(int userId);

	void updateUserDetails(User user);


}
