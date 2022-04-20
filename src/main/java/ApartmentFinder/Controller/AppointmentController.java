package ApartmentFinder.Controller;


import ApartmentFinder.Model.Apartment;
import ApartmentFinder.Model.Appointment;
import ApartmentFinder.Model.ManageAppointment;
import ApartmentFinder.Model.User;
import ApartmentFinder.Service.ApartmentService;
import ApartmentFinder.Service.AppointmentService;
import ApartmentFinder.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    private UserService userService;

    @Autowired
    private ApartmentService apartmentService;

    @Autowired
            private AppointmentService appointmentService;

    UserController userController = new UserController();
    ManageAppointment manageAppointment = new ManageAppointment();



    @RequestMapping("/{apartmentId}/{userId}")
    public String getAppointmentPage(@PathVariable("userId") int userId, @PathVariable("apartmentId") int apartmentId, Model model) {
        if(userController.isLoggedIn()){
            System.out.println("Inside getAppointmentPage List");

            User userDetails = userService.getUserDetails(userId);
            Apartment apartmentDetails = apartmentService.getApartmentDetails(apartmentId);
            model.addAttribute("apartmentDetails", apartmentDetails);
            model.addAttribute("userDetails", userDetails);

            return "appointment";

        }else{
            return "redirect:/user/login";
        }

    }

    @RequestMapping("/book/{apartmentId}/{userId}")
    public String bookAppointment(@PathVariable("userId") int userId, @PathVariable("apartmentId") int apartmentId, Model model, HttpServletRequest request) {
        if(userController.isLoggedIn()){
            System.out.println("Inside book appointment function");
            String appointmentDate = request.getParameter("appointmentDate");
            String appointmentTime = request.getParameter("appointmentTime");
            Appointment appointment = new Appointment();
            appointment.setAppointmentDate(appointmentDate);
            appointment.setAppointmentTime(appointmentTime);
            appointment.setUserId(userId);
            appointment.setApartmentId(apartmentId);
            appointmentService.bookAppointment(appointment);

            return "appointment-success";

        }else{
            return "redirect:/user/login";
        }

    }

    @RequestMapping("/manage/{userId}")
    public String manageAppointments(@PathVariable("userId") int userId,  Model model) {
        if(userController.isLoggedIn()){
            System.out.println("Inside manage appointment function");

            List<Appointment> appointmentDetails = appointmentService.getAppointmentsByUser(userId);
            Collection<Integer> apartmentIds  = getApartmentIdsList(appointmentDetails);
            List<Apartment> apartmentDetails = apartmentService.getApartmentListByApartmentIds(apartmentIds);
            User userDetails = userService.getUserDetails(userId);
            List<ManageAppointment> manageAppointments = manageAppointment.getAppointmentsObject(appointmentDetails, apartmentDetails, userDetails);
            model.addAttribute("appointmentDetails", manageAppointments);
            model.addAttribute("userDetails", userDetails);
            return "manage-appointments";

        }else{
            return "redirect:/user/login";
        }

    }

    @RequestMapping("/cancel/{appointmentId}/{userId}")
    public String cancelAppointments(@PathVariable("appointmentId") int appointmentId, @PathVariable("userId") int userId,  Model model) {
        if(userController.isLoggedIn()){
            System.out.println("Inside manage appointment function");

            appointmentService.cancelAppointment(appointmentId);


            return "redirect:/appointment/manage/{userId}";

        }else{
            return "redirect:/user/login";
        }

    }

    private Collection<Integer> getApartmentIdsList(List<Appointment> appointmentDetails){
        Collection<Integer> apartmentIds = new ArrayList<>();
        for(Appointment appointment : appointmentDetails){
            apartmentIds.add(appointment.getApartmentId());
        }
        return apartmentIds;
    }
}
