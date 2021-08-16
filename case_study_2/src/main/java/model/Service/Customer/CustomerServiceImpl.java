package model.Service.Customer;

import model.Service.Customer.ICustomerService;
import model.Service.common.Validate;
import model.bean.Customer.Customer;
import model.repository.Impl.customer.CustomerRepositoryImpl;
import model.repository.Impl.customer.ICustomerRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements ICustomerService {
    private ICustomerRepository interfaceRepository = new CustomerRepositoryImpl();

    @Override
    public List<Customer> listAll() {
        return this.interfaceRepository.listAll();
    }

    @Override
    public Map<String, String> create(Customer customer) {

        Map<String, String> mapMessage = new HashMap<>();
        if (Validate.validateName(customer.getName())!=null ||
                Validate.validateEmail(customer.getEmail())!=null ||
                Validate.validatePhone(customer.getPhone())!=null){
            mapMessage.put("name",Validate.validateName(customer.getName()));
            mapMessage.put("email",Validate.validateEmail(customer.getEmail()));
            mapMessage.put("phone",Validate.validatePhone(customer.getPhone()));

        }else {
            this.interfaceRepository.create(customer);
        }

        return mapMessage;
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

    @Override
    public List<Customer> search(String name) {
        return this.interfaceRepository.search(name);
    }


}
