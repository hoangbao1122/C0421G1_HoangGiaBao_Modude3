package model.reponsitory;

import model.bean.User;

import java.util.List;

public interface IUserRepository {
     List<User> findAll();
     User findByid(int id);
     void update(User user);
     void delete(int id);
     void insertUser(User user);
     List<User> searchCountry(String country);
     List<User> orderBy();

     //tracsaction
     List<User> searchId(int id);
     void create(User user);
}
