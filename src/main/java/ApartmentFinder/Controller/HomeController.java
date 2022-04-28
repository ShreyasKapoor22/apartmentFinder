package ApartmentFinder.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    /***
     * Function to show the index.jsp page. this is supposed to be the landing page
     */
    @RequestMapping("/")
    public String home(){
        return "index";
    }
}
