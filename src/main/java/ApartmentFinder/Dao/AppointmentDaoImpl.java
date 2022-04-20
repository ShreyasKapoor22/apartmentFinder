package ApartmentFinder.Dao;

import ApartmentFinder.Model.Apartment;
import ApartmentFinder.Model.Appointment;
import ApartmentFinder.Model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
public class AppointmentDaoImpl implements AppointmentDao{

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void bookAppointment(Appointment appointment) {
        Session session = this.sessionFactory.getCurrentSession();
        session.saveOrUpdate(appointment);
        System.out.println("Appointment booked");
    }

    @Override
    public List<Appointment> getAppointmentsByUser(int userId){
        Session session = this.sessionFactory.getCurrentSession();
        String queried = "from Appointment where userId = :userId";
        Query query = session.createQuery(queried);
        query.setParameter("userId", userId);
        return (List<Appointment>) query.getResultList();
    }


    @Override
    public void cancelAppointment(int appointmentId){
        Session session = this.sessionFactory.getCurrentSession();
        String queried = "delete from Appointment where appointmentId = :appointmentId";
        Query query = session.createQuery(queried);
        query.setParameter("appointmentId", appointmentId);
        query.executeUpdate();
        System.out.println("Appointment no "+appointmentId+" deleted");

    }
}
