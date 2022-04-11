package ApartmentFinder.Controller;

import ApartmentFinder.Model.User;
import ApartmentFinder.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @Name Shreyas Kapoor
 */

@Controller
@RequestMapping("/user")
public class UserController {
    private static final long serialVersionUID = 1L;
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String showFormForAdd(Model theModel) {
        User user = new User();
        theModel.addAttribute("user", user);
        return "register";
    }


    @PostMapping("/addUser")
    private String addUser(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("Inside add user");
        String firstName = request.getParameter("name");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String email = request.getParameter("emailAddress");
        String contactNo = request.getParameter("contactNo");

        User user = new User();
        user.setName(firstName);
        user.setContactNo(contactNo);
        user.setUsername(userName);
        user.setPassword(password);
        user.setEmailAddress(email);

        userService.addUser(user);

        return "register-success";
    }

    @PostMapping("/login")
    public String login()
    {
        return "login";
    }

    @PostMapping("/loginUser")
    private String loginUser(HttpServletRequest request, HttpServletResponse response, Model theModel) throws IOException, ServletException{

        System.out.println("Inside login user");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        boolean result = validateUser(userName, password);

        System.out.println("validated user is " + result);
        if(Boolean.TRUE.equals(result)){
            return "redirect:/apartment/list";
        }else{
            User user = new User();
            theModel.addAttribute("user", user);
            return "register";
        }

    }

    private boolean validateUser(String userName, String password){
        return userService.validateUser(userName, password);

    }

}