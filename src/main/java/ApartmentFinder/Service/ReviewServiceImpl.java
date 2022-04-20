package ApartmentFinder.Service;


import ApartmentFinder.Dao.ReviewDao;
import ApartmentFinder.Model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewDao reviewDao;


    @Override
    @Transactional
    public void addReview(Review review){
        this.reviewDao.addReview(review);
    }
}
