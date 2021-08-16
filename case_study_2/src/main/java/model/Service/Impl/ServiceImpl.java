package model.Service.Impl;

import model.bean.Service;
import model.repository.Impl.dichVu.IServiceRepository;
import model.repository.Impl.dichVu.ServiceRepositoryImpl;

import java.util.List;

public class ServiceImpl implements IService {
    private IServiceRepository iCustomerService = new ServiceRepositoryImpl();
    @Override
    public List<Service> listAll() {
        return iCustomerService.list() ;
    }

    @Override
    public void create(Service service) {
        iCustomerService.create(service);
    }
}
