package model.Service.Customer;

import model.bean.Customer.Customer;

import java.util.List;

public interface ICustomerService{
    List<Customer> listAll();
    void create(Customer customer);
    Customer findId(int id);
    void deleteCus(int id);
    void edit(Customer customer);

}
