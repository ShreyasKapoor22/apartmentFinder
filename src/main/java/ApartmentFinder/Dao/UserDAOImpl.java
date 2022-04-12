package ApartmentFinder.Dao;

import ApartmentFinder.Model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDao{
	
	private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;



	public void addUser(User u) {
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(u);
		logger.info("User saved successfully, User Details="+u);
	}

	public User validateUser(String userName, String password){
		System.out.println("Final function to check user");
		System.out.println("Username is = " +userName);
		System.out.println("Password is = "+password);
		Session session = this.sessionFactory.getCurrentSession();
		String queried = "from User where userName = :username and password = :password";
		Query query = session.createQuery(queried);
		query.setParameter("username", userName);
		query.setParameter("password", password);
		@SuppressWarnings("unchecked")
		List<User> user = (List<User>) query.getResultList();
		if(user.size() == 0){
			return new User();
		}else{
			return user.get(0);
		}
	}

	public boolean ifUserNameExists(String userName){
		System.out.println(" function to check if another user of same userName exists");
		Session session = this.sessionFactory.getCurrentSession();
		String queried = "from User where userName = :userName";
		Query query = session.createQuery(queried);

		query.setParameter("userName", userName);
		List<User> user = (List<User>) query.getResultList();
		if(user.size() == 0){
			return false;
		}else{
			return true;
		}

	}

	public User getUserDetails(int userId){
		System.out.println(" function to get userDetails");
		Session session = this.sessionFactory.getCurrentSession();
		String queried = "from User where userId = :userId";
		Query query = session.createQuery(queried);
		query.setParameter("userId", userId);
		return (User) query.getResultList().get(0);



	}

	public void updateUserDetails(User user){
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
		logger.info("User updated successfully, User Details="+user);

	}

}
