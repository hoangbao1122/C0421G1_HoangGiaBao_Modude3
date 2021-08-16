package model.repository.Impl.employee;

import model.bean.employee.Position;

import java.util.List;

public interface IPosition<T> {
    List<T> listAll();

}
