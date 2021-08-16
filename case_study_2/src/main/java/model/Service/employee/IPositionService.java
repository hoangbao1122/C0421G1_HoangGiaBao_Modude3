package model.Service.employee;

import java.util.List;

public interface IPositionService<T> {
    List<T> listAll();
}
