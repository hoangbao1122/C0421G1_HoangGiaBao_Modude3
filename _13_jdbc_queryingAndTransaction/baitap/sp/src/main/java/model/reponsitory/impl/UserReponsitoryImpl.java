package model.reponsitory.impl;

import model.bean.User;
import model.reponsitory.IUserRepository;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserReponsitoryImpl implements IUserRepository {
    private final BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("call list_all()");
            ResultSet resultSet = preparedStatement.executeQuery();
            User user = null;
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setPhone(resultSet.getString("phone"));
                user.setEmail(resultSet.getString("email"));
                user.setAddress(resultSet.getString("address"));
                user.setCountry(resultSet.getString("country"));
                userList.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userList ;
    }

    @Override
    public User findByid(int id) {

        User user = null;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("select id,name,phone,email,address,country\n" +
                            "from user\n" +
                            "where id = ?");
        preparedStatement.setString(1,id + "");
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()){
            user = new User();
            user.setId(id);
            user.setName(resultSet.getString("name"));
            user.setPhone(resultSet.getString("phone"));
            user.setEmail(resultSet.getString("email"));
            user.setAddress(resultSet.getString("address"));
            user.setCountry(resultSet.getString("country"));
        }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }

    @Override
    public void update(User user) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("    call update_user(?,?,?,?,?);");
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getPhone());
            preparedStatement.setString(3,user.getEmail());
            preparedStatement.setString(4,user.getAddress());
            preparedStatement.setString(5,user.getCountry());

            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try {
            CallableStatement callableStatement = this.baseRepository.getConnection().prepareCall("" +
                    " call delete_user(?);");
            callableStatement.setString(1,id + "");
            callableStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void insertUser(User user) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("insert into user (name,phone,email,address,country)\n" +
                            "value(?,?,?,?,?)");
        preparedStatement.setString(1,user.getName());
        preparedStatement.setString(2,user.getPhone());
        preparedStatement.setString(3,user.getEmail());
        preparedStatement.setString(4,user.getAddress());
        preparedStatement.setString(5,user.getCountry());

        preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public  List<User> searchCountry(String country) {
        List<User> userList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("" +
                    "select id,name,phone,email,address,country\n" +
                    "    from `user` \n" +
                    "      where country = ?;");
            preparedStatement.setString(1,country);
            ResultSet resultSet  = preparedStatement.executeQuery();
            User user = null;
            while (resultSet.next()){
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setPhone(resultSet.getString("phone"));
                user.setEmail(resultSet.getString("email"));
                user.setAddress(resultSet.getString("address"));
                user.setCountry(resultSet.getString("country"));
                userList.add(user);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userList;
    }

    @Override
    public List<User> orderBy() {
        List<User> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("select id,name,phone,email,address,country\n" +
                            "from user\n" +
                            "order by name asc");
                ResultSet resultSet = preparedStatement.executeQuery();
                User user = null;
                while (resultSet.next()){
                    user = new User();
                    user.setId(resultSet.getInt("id"));
                    user.setName(resultSet.getString("name"));
                    user.setPhone(resultSet.getString("phone"));
                    user.setEmail(resultSet.getString("email"));
                    user.setAddress(resultSet.getString("address"));
                    user.setCountry(resultSet.getString("country"));
                    list.add(user);
                }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;

    }
}
