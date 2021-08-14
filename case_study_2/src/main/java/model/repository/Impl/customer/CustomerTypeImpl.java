package model.repository.Impl.customer;

import model.bean.Customer.CustomerType;
import model.repository.BaseRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeImpl implements ICustomerType {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<CustomerType> listAll() {
        List<CustomerType> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("select * \n" +
                            "from customer_type");
            ResultSet resultSet = preparedStatement.executeQuery();
            CustomerType customerType = null;
            while (resultSet.next()){
                customerType = new CustomerType();
                customerType.setCusTypeId(resultSet.getInt("customer_type_id"));
                customerType.setNameType(resultSet.getString("customer_type_name"));

                list.add(customerType);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
}
