package ApartmentFinder.Model;


import javax.persistence.*;

@Entity
@Table(name = "Appointment")
public class Appointment {

    @Id
    @Column(name = "appointmentId")
    @GeneratedValue
    private int appointmentId;

    @Column(name = "apartmentId")
    private int apartmentId;

    @Column(name = "userId")
    private int userId;

    @Column(name = "appointmentDate")
    private String appointmentDate;

    @Column(name = "appointmentTime")
    private String appointmentTime;

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
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


}
