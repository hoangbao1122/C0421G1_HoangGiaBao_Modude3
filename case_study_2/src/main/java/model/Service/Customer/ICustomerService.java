package model.Service.Customer;

import model.bean.Customer.Customer;

import java.util.List;
import java.util.Map;

public interface ICustomerService{
    List<Customer> listAll();
    Map<String,String> create(Customer customer);
    Customer findId(int id);
    void deleteCus(int id);
   void edit(Customer customer);
    List<Customer> search(String name);
}
