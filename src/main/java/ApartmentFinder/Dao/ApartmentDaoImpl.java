package ApartmentFinder.Dao;

import ApartmentFinder.Model.Apartment;
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
public class ApartmentDaoImpl implements  ApartmentDao {

    private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Apartment> getApartmentList() {
        System.out.println("Getting list of apartments");
        Session session = this.sessionFactory.getCurrentSession();
        String queried = "from Apartment";
        Query query = session.createQuery(queried);
        @SuppressWarnings("unchecked")
        List<Apartment> apartmentList = (List<Apartment>)query.getResultList();
        return apartmentList;
    }
}
