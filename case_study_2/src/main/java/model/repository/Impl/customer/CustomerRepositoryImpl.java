package model.repository.Impl.customer;

import model.bean.Customer.Customer;
import model.repository.BaseRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Customer> listAll() {
        List<Customer> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("select * \n" +
                            "from customer");
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer = null;

            while (resultSet.next()) {
                customer = new Customer();
                customer.setId(resultSet.getInt("customer_id"));
                customer.setType_id(resultSet.getInt("customer_type_id"));
                customer.setName(resultSet.getString("customer_name"));
                customer.setBirthday(resultSet.getString("customer_birthday"));
                customer.setGender(resultSet.getString("customer_gender"));
                customer.setId_card(resultSet.getString("customer_id_card"));
                customer.setPhone(resultSet.getString("customer_phone"));
                customer.setEmail(resultSet.getString("customer_email"));
                customer.setAddress(resultSet.getString("customer_address"));
                list.add(customer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public void create(Customer customer) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("insert into customer(customer_type_id,customer_name,customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_address)\n" +
                            "value(?,?,?,?,?,?,?,?);");
            preparedStatement.setInt(1, customer.getType_id());
            preparedStatement.setString(2, customer.getName());
            preparedStatement.setString(3, customer.getBirthday());
            preparedStatement.setString(4, customer.getGender());
            preparedStatement.setString(5, customer.getId_card());
            preparedStatement.setString(6, customer.getPhone());
            preparedStatement.setString(7, customer.getEmail());
            preparedStatement.setString(8, customer.getAddress());

            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Customer findById(int id) {
        Customer customer = null;

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("select * \n" +
                            "from customer\n" +
                            "where `customer_id` = ?;");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                customer = new Customer();
                customer.setId(id);
                customer.setType_id(resultSet.getInt("customer_type_id"));
                customer.setName(resultSet.getString("customer_name"));
                customer.setBirthday(resultSet.getString("customer_birthday"));
                customer.setGender(resultSet.getString("customer_gender"));
                customer.setId_card(resultSet.getString("customer_id_card"));
                customer.setPhone(resultSet.getString("customer_phone"));
                customer.setEmail(resultSet.getString("customer_email"));
                customer.setAddress(resultSet.getString("customer_address"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customer;
    }

    @Override
    public void deleteCus(int id) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("delete  \n" +
                            "from customer\n" +
                            "where customer_id = ?");
            preparedStatement.setString(1, id + " ");
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void edit(Customer customer) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("update customer\n" +
                            "set customer_type_id = ?,customer_name = ?,customer_birthday=?,customer_gender=?,customer_id_card=?,customer_phone=?,customer_email=?,customer_address=?\n" +
                            "where customer_id = ?;");
            preparedStatement.setInt(1, customer.getType_id());
            preparedStatement.setString(2, customer.getName());
            preparedStatement.setString(3, customer.getBirthday());
            preparedStatement.setString(4, customer.getGender());
            preparedStatement.setString(5, customer.getId_card());
            preparedStatement.setString(6, customer.getPhone());
            preparedStatement.setString(7, customer.getEmail());
            preparedStatement.setString(8, customer.getAddress());
            preparedStatement.setInt(9, customer.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Customer> search(String name) {
        List<Customer> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("\n" +
                            "select * \n" +
                            "from customer\n" +
                            "where `customer_name` = ?;");
            preparedStatement.setString(1,name);
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer = null;
            while (resultSet.next()){
                customer = new Customer();
                customer.setId(resultSet.getInt("customer_id"));
                customer.setType_id(resultSet.getInt("customer_type_id"));
                customer.setName(resultSet.getString("customer_name"));
                customer.setBirthday(resultSet.getString("customer_birthday"));
                customer.setGender(resultSet.getString("customer_gender"));
                customer.setId_card(resultSet.getString("customer_id_card"));
                customer.setPhone(resultSet.getString("customer_phone"));
                customer.setEmail(resultSet.getString("customer_email"));
                customer.setAddress(resultSet.getString("customer_address"));
                list.add(customer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return list;
    }


}
