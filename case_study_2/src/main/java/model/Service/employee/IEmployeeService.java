package model.Service.employee;

import model.bean.employee.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> list();
    void create(Employee employee);
    Employee findId(int id);
    void delete(int id);
    void edit(Employee employee);
}
