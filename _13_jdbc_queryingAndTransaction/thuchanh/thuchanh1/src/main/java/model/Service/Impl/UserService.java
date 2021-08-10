package model.Service.Impl;

import model.Service.IUserService;
import model.bean.User;
import model.reponsitory.IUserRepository;
import model.reponsitory.impl.UserReponsitoryImpl;

import java.util.List;

public class UserService implements IUserService {

    private IUserRepository iUserRepository = new UserReponsitoryImpl();
    @Override
    public List<User> listAll() {
        return iUserRepository.findAll();
    }

    @Override
    public User findById(Integer id) {
        return iUserRepository.findByid(id);
    }

    @Override
    public void update(User user) {
         iUserRepository.update(user);
    }

    @Override
    public void detete(int id) {
        iUserRepository.delete(id);
    }

    @Override
    public void insert(User user) {
        iUserRepository.insertUser(user);
    }

    @Override
    public List<User> search(String country) {
        return iUserRepository.searchCountry(country);
    }

    @Override
    public List<User> orderBy() {
        return iUserRepository.orderBy();
    }

    @Override
    public List<User> searchId(int id) {
        return this.iUserRepository.searchId(id);
    }

    @Override
    public void create(User user) {
        this.iUserRepository.create(user);
    }
}
