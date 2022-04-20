package ApartmentFinder.Dao;

import ApartmentFinder.Model.Apartment;
import ApartmentFinder.Model.ReviewAndRating;

import java.util.Collection;
import java.util.List;

public interface ApartmentDao {

    List<Apartment> getApartmentList();

    Apartment getApartmentDetails(int apartmentId);

    List<Apartment> getApartmentListByApartmentIds(Collection<Integer> apartmentIds);

    void updateRating(int apartmentId, double rating, int noOfReviews);





}
