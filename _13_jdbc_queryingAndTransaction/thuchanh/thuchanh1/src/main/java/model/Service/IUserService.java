package model.Service;

import model.bean.User;

import java.util.List;

public interface IUserService {
    List<User> listAll();
    User findById(Integer id);
    void update(User user);
    void detete(int id);
    void insert(User user);
    List<User> search(String country);
    List<User> orderBy();

    //transaction
    List<User> searchId(int id);
    void create(User user);
}
