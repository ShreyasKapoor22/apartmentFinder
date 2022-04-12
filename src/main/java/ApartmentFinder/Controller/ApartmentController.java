package ApartmentFinder.Controller;


import ApartmentFinder.Model.Apartment;
import ApartmentFinder.Model.User;
import ApartmentFinder.Service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/apartment")
public class ApartmentController {

    @Autowired
    private ApartmentService apartmentService;


    @GetMapping("/list")
    public String showApartmentList( Model theModel, HttpServletRequest request) {
        System.out.println("Inside showApartment List");
        List<Apartment> apartmentList = apartmentService.getApartmentList();
        User user = (User) request.getSession().getAttribute("userData");
        assert user != null;
        System.out.println("User data fetched in apartment list = "+ user.getUserName());

        theModel.addAttribute("apartmentList", apartmentList);
        theModel.addAttribute("userData", user);
        System.out.println("No of apartments = " + apartmentList.size());
        return "apartments";
    }
}
