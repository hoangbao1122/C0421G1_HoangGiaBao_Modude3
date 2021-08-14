package model.Service.Customer;

import model.Service.Customer.ICustomerService;
import model.bean.Customer.Customer;
import model.repository.Impl.customer.CustomerRepositoryImpl;
import model.repository.Impl.customer.ICustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    private ICustomerRepository interfaceRepository = new CustomerRepositoryImpl();

    @Override
    public List<Customer> listAll() {
        return this.interfaceRepository.listAll();
    }

    @Override
    public void create(Customer customer) {
        this.interfaceRepository.create(customer);
    }

    @Override
    public Customer findId(int id) {
        return this.interfaceRepository.findById(id);
    }

    @Override
    public void deleteCus(int id) {
        this.interfaceRepository.deleteCus(id);
    }

    @Override
    public void edit(Customer customer) {
        this.interfaceRepository.edit(customer);
    }
}
