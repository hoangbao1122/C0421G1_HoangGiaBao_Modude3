package model.Service.Impl;


import model.bean.Service;

import java.util.List;

public interface IService {
    List<Service> listAll();
    void create(Service service);
}
