package main.com.spring.training.repository;


import main.com.spring.training.domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {


    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<Employee>();
        Employee employee = new Employee();
        employee.setEmployeeName("Senura");
        employee.setEmployeeLocation("Anuradhapura");
        employees.add(employee);
        return employees;

    }
}
