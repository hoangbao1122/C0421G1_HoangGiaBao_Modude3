package model.Service;

import model.bean.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
}
