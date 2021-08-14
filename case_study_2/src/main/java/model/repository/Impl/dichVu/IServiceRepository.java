package model.repository.Impl.dichVu;

import model.bean.Service;

import java.util.List;

public interface IServiceRepository {
    List<Service> list();
    void create(Service service);
}
