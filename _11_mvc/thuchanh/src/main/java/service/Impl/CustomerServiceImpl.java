package service.Impl;

import model.Customer;
import service.CustomerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer,Customer> map = new HashMap<>();
    static {
        map.put(1,new Customer(1,"hoangbao","hoangboasd@gamil.com","da nang"));
        map.put(2,new Customer(2,"hoangbao","hoangboasd@gamil.com","da nang"));
        map.put(3,new Customer(3,"hoangbao","hoangboasd@gamil.com","da nang"));

    }


    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public void save(Customer customer) {

    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Customer customer) {

    }

    @Override
    public void remove(int id) {

    }
}
