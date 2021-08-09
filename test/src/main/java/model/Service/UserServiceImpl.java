package model.Service;

import model.bean.User;
import model.reponsitory.impl.UserReponsitoryImpl;

import java.util.List;

public class UserServiceImpl implements IUserService {

    UserReponsitoryImpl userReponsitory = new UserReponsitoryImpl();
    @Override
    public List<User> findAll() {
        return this.userReponsitory.findAll();
    }
}
