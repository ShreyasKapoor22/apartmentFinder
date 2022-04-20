package ApartmentFinder.Service;

import ApartmentFinder.Dao.ApartmentDao;
import ApartmentFinder.Model.Apartment;
import ApartmentFinder.Model.ReviewAndRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;


@Service
public class ApartmentServiceImpl implements ApartmentService {


    @Autowired
    private ApartmentDao apartmentDao;

    @Override
    @Transactional
    public List<Apartment> getApartmentList() {
        return this.apartmentDao.getApartmentList();
    }

    @Override
    @Transactional
    public Apartment getApartmentDetails(int apartmentId) {
        return this.apartmentDao.getApartmentDetails(apartmentId);
    }

    @Override
    @Transactional
    public List<Apartment> getApartmentListByApartmentIds(Collection<Integer> apartmentIds) {
        return this.apartmentDao.getApartmentListByApartmentIds(apartmentIds);
    }

    @Override
    @Transactional
    public void updateRating(int apartmentId, double rating, int noOfReviews){
        this.apartmentDao.updateRating(apartmentId, rating, noOfReviews);
    }

}
