package ApartmentFinder.Service;

import ApartmentFinder.Dao.ApartmentDao;
import ApartmentFinder.Model.Apartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
