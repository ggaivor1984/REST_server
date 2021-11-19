package ru.gaivor.spring.rest.dao;

import ru.gaivor.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

  public  Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
