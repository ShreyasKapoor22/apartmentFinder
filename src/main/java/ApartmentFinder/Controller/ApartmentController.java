package ApartmentFinder.Controller;


import ApartmentFinder.Model.Apartment;
import ApartmentFinder.Model.User;
import ApartmentFinder.Service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/apartment")
public class ApartmentController {

    @Autowired
    private ApartmentService apartmentService;


    @GetMapping("/list")
    public String showApartmentList(Model theModel) {
        List<Apartment> apartmentList = apartmentService.getApartmentList();
        theModel.addAttribute("apartmentList", apartmentList);
        System.out.println("No of apartments = " + apartmentList.size());
        return "apartments";
    }
}
