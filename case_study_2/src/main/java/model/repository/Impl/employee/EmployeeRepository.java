package model.repository.Impl.employee;

import model.bean.employee.Employee;
import model.repository.BaseRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRespository {
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Employee> listAll() {
        List<Employee> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("select * \n" +
                            "from employee");
            ResultSet resultSet = preparedStatement.executeQuery();
            Employee employee = null;
            while (resultSet.next()) {
                employee = new Employee();
                employee.setIdEmp(resultSet.getInt("id_emp"));
                employee.setNameEmp(resultSet.getString("name_emp"));
                employee.setBirthdayEmp(resultSet.getString("birthday_emp"));
                employee.setIdCardEmp(resultSet.getString("id_card_emp"));
                employee.setSalaryEmp(resultSet.getString("salary_emp"));
                employee.setPhoneEmp(resultSet.getString("phone_emp"));
                employee.setEmailEmp(resultSet.getString("email_emp"));
                employee.setAddressEmp(resultSet.getString("address_emp"));
                employee.setPositionEmp(resultSet.getInt("position_id"));
                employee.setEducationEmp(resultSet.getInt("education_degree_id"));
                employee.setDivisionEmp(resultSet.getInt("division_id"));
                employee.setUserNameEmp(resultSet.getString("username"));
                list.add(employee);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public void create(Employee employee) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("call insert_employee(?,?,?,?,?,?,?,?,?,?,?);");
            preparedStatement.setString(1,employee.getNameEmp());
            preparedStatement.setString(2,employee.getBirthdayEmp());
            preparedStatement.setString(3,employee.getIdCardEmp());
            preparedStatement.setString(4,employee.getSalaryEmp());
            preparedStatement.setString(5,employee.getPhoneEmp());
            preparedStatement.setString(6,employee.getEmailEmp());
            preparedStatement.setString(7,employee.getAddressEmp());
            preparedStatement.setInt(8,employee.getPositionEmp());
            preparedStatement.setInt(9,employee.getEducationEmp());
            preparedStatement.setInt(10,employee.getDivisionEmp());
            preparedStatement.setString(11,employee.getUserNameEmp());

            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Employee findId(int id) {
        Employee employee = null;
        try{
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("select *\n" +
                            "from employee\n" +
                            "where id_emp = ?");
                    preparedStatement.setInt(1,id);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if (resultSet.next()){
                     employee = new Employee();
                     employee.setIdEmp(resultSet.getInt("id_emp"));
                     employee.setNameEmp(resultSet.getString("name_emp"));
                     employee.setBirthdayEmp(resultSet.getString("birthday_emp"));
                     employee.setIdCardEmp(resultSet.getString("id_card_emp"));
                     employee.setSalaryEmp(resultSet.getString("salary_emp"));
                     employee.setPhoneEmp(resultSet.getString("phone_emp"));
                     employee.setEmailEmp(resultSet.getString("email_emp"));
                     employee.setPositionEmp(resultSet.getInt("position_id"));
                     employee.setEducationEmp(resultSet.getInt("education_degree_id"));
                     employee.setDivisionEmp(resultSet.getInt("division_id"));
                     employee.setUserNameEmp(resultSet.getString("username"));
                    }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employee;
    }

    @Override
    public void delete(int id) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("delete from employee\n" +
                            "where id_emp = ?;");
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
