package ApartmentFinder.Service;

import ApartmentFinder.Dao.ApartmentDao;
import ApartmentFinder.Dao.AppointmentDao;
import ApartmentFinder.Model.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentDao appointmentDao;



    @Override
    @Transactional
    public void bookAppointment(Appointment appointment) {
        this.appointmentDao.bookAppointment(appointment);
    }


    @Override
    @Transactional
    public List<Appointment> getAppointmentsByUser(int userId) {
        return this.appointmentDao.getAppointmentsByUser(userId);
    }

    @Override
    @Transactional
    public void cancelAppointment(int appointmentId){
        this.appointmentDao.cancelAppointment(appointmentId);
    }
}
