package model.Service.Customer;

import model.bean.Customer.CustomerType;
import model.repository.Impl.customer.CustomerTypeImpl;
import model.repository.Impl.customer.ICustomerType;

import java.util.List;

public class CustomerTypeServiceImpl implements ICustomerTypeService {
    private ICustomerType iCustomerType = new CustomerTypeImpl();
    @Override
    public List<CustomerType> listAll() {
        return iCustomerType.listAll();
    }
}
