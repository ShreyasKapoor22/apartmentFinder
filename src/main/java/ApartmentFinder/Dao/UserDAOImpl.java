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

	public boolean validateUser(String userName, String password){
		System.out.println("Final function to check user");
		System.out.println("Username is = " +userName);
		System.out.println("Password is = "+password);
		Session session = this.sessionFactory.getCurrentSession();
		String queried = "from User where userName = :username and password = :password";
		Query query = session.createQuery(queried);
		query.setParameter("username", userName);
		query.setParameter("password", password);
		@SuppressWarnings("unchecked")
		List<User> userList = (List<User>)query.getResultList();
		return userList != null && !userList.isEmpty();

	}

}
