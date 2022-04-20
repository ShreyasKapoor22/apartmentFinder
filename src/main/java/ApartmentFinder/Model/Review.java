package ApartmentFinder.Model;


import javax.persistence.*;

@Entity
@Table(name = "Review")
public class Review {

    @Id
    @Column(name = "reviewId")
    @GeneratedValue
    private int reviewId;

    @Column(name = "apartmentId")
    private int apartmentId;

    @Column(name = "userId")
    private int userId;

    @Column(name = "review")
    private String review;

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(int apartmentId) {
        this.apartmentId = apartmentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public double getReviewRating() {
        return reviewRating;
    }

    public void setReviewRating(double reviewRating) {
        this.reviewRating = reviewRating;
    }

    @Column(name = "reviewRating")
    private double reviewRating;

}
