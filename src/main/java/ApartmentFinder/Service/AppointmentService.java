package ApartmentFinder.Service;

import ApartmentFinder.Model.Appointment;

import java.util.List;

public interface AppointmentService {

    void bookAppointment(Appointment appointment);

    List<Appointment> getAppointmentsByUser(int userId);

    void cancelAppointment(int appointmentId);
}
