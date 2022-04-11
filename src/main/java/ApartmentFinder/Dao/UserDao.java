package ApartmentFinder.Dao;

import ApartmentFinder.Model.User;

import java.util.List;

public interface UserDao {

    void addUser(User u);

    boolean validateUser(String userName, String password);



}
