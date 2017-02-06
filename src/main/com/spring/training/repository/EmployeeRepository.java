package main.com.spring.training.repository;


import main.com.spring.training.domain.Employee;
import java.util.List;

public interface EmployeeRepository {

    public List<Employee> getAllEmployees();
}
