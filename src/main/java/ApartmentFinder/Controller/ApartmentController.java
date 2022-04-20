package ApartmentFinder.Controller;


import ApartmentFinder.Model.Apartment;
import ApartmentFinder.Model.User;
import ApartmentFinder.Service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/apartment")
public class ApartmentController {

    @Autowired
    private ApartmentService apartmentService;

    UserController userController = new UserController();


    @RequestMapping("/list")
    public String showApartmentList( Model theModel, HttpServletRequest request) {
        if(userController.isLoggedIn()){
            System.out.println("Inside showApartment List");
            List<Apartment> apartmentList = apartmentService.getApartmentList();
            User user = (User) request.getSession().getAttribute("userData");
            assert user != null;
            System.out.println("User data fetched in apartment list = "+ user.getUserName());

            theModel.addAttribute("apartmentList", apartmentList);
            theModel.addAttribute("userData", user);
            System.out.println("No of apartments = " + apartmentList.size());
            return "apartments";

        }else{
            return "redirect:/user/login";
        }

    }
}
