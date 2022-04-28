package ApartmentFinder.Controller;

import ApartmentFinder.Model.User;
import ApartmentFinder.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        UserController.loggedIn = loggedIn;
    }

    private static boolean loggedIn = false;


    /***
     * Function to show the register page
     */
    @RequestMapping("/register")
    public String showFormForAdd(Model theModel) {
        User user = new User();
        theModel.addAttribute("user", user);
        return "register";
    }

    /***
     * Function to add user into the databse
     */
    @RequestMapping("/addUser")
    private String addUser(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("Inside add user");
        String firstName = request.getParameter("name");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String email = request.getParameter("emailAddress");
        String contactNo = request.getParameter("contactNo");
        boolean userExists = userService.ifUserNameExists(userName);
        if(Boolean.FALSE.equals(userExists)){
            User user = new User();
            user.setName(firstName);
            user.setContactNo(contactNo);
            user.setUsername(userName);
            user.setPassword(password);
            user.setEmailAddress(email);

            userService.addUser(user);
            request.getSession().setAttribute("userData", user);
            setLoggedIn(true);

            return "redirect:/apartment/list";
        }else{
            return "register-fail";
        }
    }

    /***
     * Function to show login page
     */
    @RequestMapping("/login")
    public String login()
    {
        return "login";
    }


    /***
     * Function to login the user. If the credentials are not found, the user is redirected to the register page
     */
    @RequestMapping("/loginUser")
    private String loginUser(HttpServletRequest request, Model theModel){

        System.out.println("Inside login user");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        User user = validateUser(userName, password);

        System.out.println("validated user is " + user.getUserName());
        if(user.getUserName() != null){
            System.out.println("User name is ="+ user.getName());
            request.getSession().setAttribute("userData", user);
            setLoggedIn(true);
            return "redirect:/apartment/list";
        }else{
            User newUser = new User();
            theModel.addAttribute("user", newUser);
            return "register";
        }

    }

    private User validateUser(String userName, String password){
        return userService.validateUser(userName, password);

    }

    /***
     * Function to edit the details of the user
     */
    @RequestMapping("/editProfile/{userId}")
    public String editProfile(@PathVariable("userId") int userId, Model model)
    {
        if(isLoggedIn()){
            System.out.println("Inside edit profile");
            System.out.println("UserId = "+ userId);
            User userDetails = userService.getUserDetails(userId);
            model.addAttribute("userDetails", userDetails);

            return "edit-profile";
        }else{
            return "login";
        }

    }

    @RequestMapping("/updateUserDetails")
    private String updateDetails(HttpServletRequest request) {
        if(isLoggedIn()){
            System.out.println("Inside update Details");
            String firstName = request.getParameter("name");
            String password = request.getParameter("password");
            String email = request.getParameter("emailAddress");
            String userName = request.getParameter("userName");
            String contactNo = request.getParameter("contactNo");
            String userId = request.getParameter("userId");
            User user = new User();
            user.setUserId(Integer.parseInt(userId));
            user.setName(firstName);
            user.setUsername(userName);
            user.setContactNo(contactNo);
            user.setPassword(password);
            user.setEmailAddress(email);

            userService.addUser(user);

            request.getSession().setAttribute("userData", user);
            return "redirect:/apartment/list";
        }else{
            return "login";
        }

    }

}