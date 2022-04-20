package ApartmentFinder.Dao;


import ApartmentFinder.Model.Review;
import ApartmentFinder.Model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewDaoImpl implements ReviewDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void addReview(Review review) {
        Session session = this.sessionFactory.getCurrentSession();
        session.saveOrUpdate(review);
        System.out.println("Review successfully added to DB");
    }
}
