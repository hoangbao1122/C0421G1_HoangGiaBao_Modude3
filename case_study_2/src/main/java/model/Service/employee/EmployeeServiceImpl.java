package model.Service.employee;

import model.Service.common.Validate;
import model.Service.employee.IEmployeeService;
import model.bean.employee.Employee;
import model.repository.Impl.employee.EmployeeRepository;
import model.repository.Impl.employee.IEmployeeRespository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServiceImpl implements IEmployeeService {
    private IEmployeeRespository iEmployeeRespository = new EmployeeRepository();

    @Override
    public List<Employee> list() {
        return iEmployeeRespository.listAll();
    }

    @Override
    public void create(Employee employee) {
        this.iEmployeeRespository.create(employee);
    }


    @Override
    public Employee findId(int id) {
        return this.iEmployeeRespository.findId(id);
    }

    @Override
    public void delete(int id) {
        this.iEmployeeRespository.delete(id);
    }

    @Override
    public void edit(Employee employee) {
        this.iEmployeeRespository.edit(employee);
    }
}
