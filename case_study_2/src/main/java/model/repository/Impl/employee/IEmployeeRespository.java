package model.repository.Impl.employee;

import model.bean.employee.Employee;

import java.util.List;

public interface IEmployeeRespository {
    List<Employee> listAll();
    void create(Employee employee);
    Employee findId(int id);
    void delete(int id);

}
