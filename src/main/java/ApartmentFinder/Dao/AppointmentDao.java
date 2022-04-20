package ApartmentFinder.Dao;

import ApartmentFinder.Model.Appointment;

import java.util.List;

public interface AppointmentDao {

    void bookAppointment(Appointment appointment);

    List<Appointment> getAppointmentsByUser(int userId);

    void cancelAppointment(int appointmentId);


}
