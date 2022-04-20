package ApartmentFinder.Service;

import ApartmentFinder.Model.Apartment;
import ApartmentFinder.Model.ReviewAndRating;

import java.util.Collection;
import java.util.List;

public interface ApartmentService {

    List<Apartment> getApartmentList();

    Apartment getApartmentDetails(int apartmentId);

    List<Apartment> getApartmentListByApartmentIds(Collection<Integer> apartmentIds);

    void updateRating(int apartmentId, double rating, int noOfReviews);

}
