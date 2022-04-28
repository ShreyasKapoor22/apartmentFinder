package ApartmentFinder.Controller;



import ApartmentFinder.Config.NLPPipeline;
import ApartmentFinder.Model.Apartment;
import ApartmentFinder.Model.Review;
import ApartmentFinder.Model.ReviewAndRating;
import ApartmentFinder.Model.User;
import ApartmentFinder.Service.ApartmentService;
import ApartmentFinder.Service.ReviewService;
import ApartmentFinder.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    private UserService userService;

    @Autowired
    private ApartmentService apartmentService;

    @Autowired
    private ReviewService reviewService;

    UserController userController = new UserController();

    static NLPPipeline nlpPipeline = new NLPPipeline();
    String PRECISION = "%.1f";


    /***
     * Function to show review page.
     */
    @RequestMapping("/addReview/{apartmentId}/{userId}")
    public String showReviewPage(@PathVariable("userId") int userId, @PathVariable("apartmentId") int apartmentId, Model model) {
        if(userController.isLoggedIn()){
            System.out.println("Inside function to get review page");

            User userDetails = userService.getUserDetails(userId);
            System.out.println("User Details successfully fetched");
            Apartment apartmentDetails = apartmentService.getApartmentDetails(apartmentId);
            System.out.println("Apartment Details successfully fetched");
            model.addAttribute("apartmentDetails", apartmentDetails);
            model.addAttribute("userDetails", userDetails);

            return "add-review";

        }else{
            return "redirect:/user/login";
        }
    }

    /***
     * Function to add the review submitted by the user
     */
    @RequestMapping("/add/{apartmentId}/{userId}")
    public String addReview(@PathVariable("userId") int userId, @PathVariable("apartmentId") int apartmentId, Model model, HttpServletRequest request) {
        if(userController.isLoggedIn()){
            System.out.println("Inside function to add review");
            String review = request.getParameter("review");
            nlpPipeline.init();
            double rating = nlpPipeline.estimatingSentiment(review);
            Review newReview = new Review();
            newReview.setReview(review);
            newReview.setReviewRating(rating);
            newReview.setUserId(userId);
            newReview.setApartmentId(apartmentId);
            reviewService.addReview(newReview);

            Apartment apartmentDetails = apartmentService.getApartmentDetails(apartmentId);

            double updatedRating = updateDetailsAboutRating(apartmentDetails.getRating(), apartmentDetails.getNoOfReviews(), rating);
            System.out.println(review);
            System.out.println("Old Rating "+ apartmentDetails.getRating());
            System.out.println("Old No of reviews "+apartmentDetails.getNoOfReviews());
            System.out.println("Updated rating "+ updatedRating);
            apartmentService.updateRating(apartmentId, updatedRating, apartmentDetails.getNoOfReviews()+1);
            System.out.println("Rating updated in apartment table");
            return "redirect:/apartment/list";

        }else{
            return "redirect:/user/login";
        }


    }

    /***
     * Helper function to update the rating and review.
     */
    private double updateDetailsAboutRating(double oldRating, int noOfReviews, double rating){
        double newRating = ((oldRating*noOfReviews) + rating)/(noOfReviews+1);
        newRating = Double.parseDouble(String.format(PRECISION, newRating));
        return newRating;

    }
}
