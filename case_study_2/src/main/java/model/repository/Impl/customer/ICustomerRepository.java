package model.repository.Impl.customer;

import model.bean.Customer.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> listAll();
    void create(Customer customer);
    Customer findById(int id);
    void deleteCus(int id);
    void edit(Customer customer);
}
