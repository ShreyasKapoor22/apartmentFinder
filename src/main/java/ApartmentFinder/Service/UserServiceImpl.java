package ApartmentFinder.Service;

import ApartmentFinder.Dao.UserDAOImpl;
import ApartmentFinder.Dao.UserDao;
import ApartmentFinder.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDAO;

	@Override
	@Transactional
	public void addUser(User u) {
		this.userDAO.addUser(u);
	}


	@Override
	@Transactional
	public User validateUser(String userName, String password){
		return this.userDAO.validateUser(userName, password);
	}

	@Override
	@Transactional
	public boolean ifUserNameExists(String userName){
		return this.userDAO.ifUserNameExists(userName);
	}

	@Override
	@Transactional
	public User getUserDetails(int userId){
		return this.userDAO.getUserDetails(userId);
	}

	@Override
	@Transactional
	public void updateUserDetails(User user){
		this.userDAO.updateUserDetails(user);
	}
}
