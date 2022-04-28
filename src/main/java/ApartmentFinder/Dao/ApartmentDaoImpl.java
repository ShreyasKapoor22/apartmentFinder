package ApartmentFinder.Dao;

import ApartmentFinder.Model.Apartment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.Collection;
import java.util.List;


@Repository
public class ApartmentDaoImpl implements  ApartmentDao {

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

    @Override
    public Apartment getApartmentDetails(int apartmentId) {
        System.out.println("Getting details of apartment");
        Session session = this.sessionFactory.getCurrentSession();
        String queried = "from Apartment where apartmentId = :apartmentId";
        Query query = session.createQuery(queried);

        query.setParameter("apartmentId", apartmentId);
        @SuppressWarnings("unchecked")
        Apartment apartmentDetails = (Apartment) query.getResultList().get(0);

        return apartmentDetails;
    }

    @Override
    public List<Apartment> getApartmentListByApartmentIds(Collection<Integer> apartmentIds){
        System.out.println("Getting list of apartments by apartmentIds");
        Session session = this.sessionFactory.getCurrentSession();
        String queried = "from Apartment where apartmentId IN (:apartmentIds)";
        Query query = session.createQuery(queried);
        ((org.hibernate.query.Query<?>) query).setParameterList("apartmentIds", apartmentIds);
        @SuppressWarnings("unchecked")
        List<Apartment> apartmentList = (List<Apartment>)query.getResultList();
        return apartmentList;

    }

    @Override
    public void updateRating(int apartmentId, double rating, int noOfReviews){
        System.out.println("Updating rating and no of reviews in apartment table");
        Session session = this.sessionFactory.getCurrentSession();
        Apartment apartment=session.get(Apartment.class, apartmentId);
        apartment.setRating(rating);
        apartment.setNoOfReviews(noOfReviews);
        session.saveOrUpdate(apartment);
    }

}
