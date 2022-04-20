package ApartmentFinder.Model;

import java.util.ArrayList;
import java.util.List;

public class ManageAppointment {

    public int getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(int apartmentId) {
        this.apartmentId = apartmentId;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getApartmentAddress() {
        return apartmentAddress;
    }

    public void setApartmentAddress(String apartmentAddress) {
        this.apartmentAddress = apartmentAddress;
    }

    public String getApartmentName() {
        return apartmentName;
    }

    public void setApartmentName(String apartmentName) {
        this.apartmentName = apartmentName;
    }

    private int apartmentId;
    private int appointmentId;
    private int userId;
    private String apartmentAddress;
    private String apartmentName;
    private String appointmentDate;

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    private String appointmentTime;

    public ManageAppointment(int apartmentId, int appointmentId, int userId, String apartmentAddress, String apartmentName, String appointmentDate, String appointmentTime) {
        this.apartmentId = apartmentId;
        this.appointmentId = appointmentId;
        this.userId = userId;
        this.apartmentAddress = apartmentAddress;
        this.apartmentName = apartmentName;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;

    }

    public ManageAppointment(){

    }

    public List<ManageAppointment> getAppointmentsObject(List<Appointment> appointmentDetails, List<Apartment> apartmentDetails, User userDetails){
        List<ManageAppointment> manageAppointments = new ArrayList<>();

        for(Appointment appointment : appointmentDetails){
            int appointmentId = appointment.getAppointmentId();
            int userId = userDetails.getUserId();
            int apartmentId = appointment.getApartmentId();
            String appointmentDate = appointment.getAppointmentDate();
            String appointmentTime = appointment.getAppointmentTime();
            for(Apartment apartment : apartmentDetails){
                if(apartment.getApartmentId() == apartmentId){
                    String apartmentName = apartment.getName();
                    String address = apartment.getAddress();
                    ManageAppointment currentAppointment = new ManageAppointment(apartmentId, appointmentId, userId, address, apartmentName, appointmentDate, appointmentTime);
                    manageAppointments.add(currentAppointment);
                    break;
                }
            }

        }
        return  manageAppointments;


    }


}
