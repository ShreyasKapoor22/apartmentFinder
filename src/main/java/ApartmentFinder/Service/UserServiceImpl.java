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
	public boolean validateUser(String userName, String password){
		return this.userDAO.validateUser(userName, password);
	}
}
