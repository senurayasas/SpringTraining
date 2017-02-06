package main.com.spring.training.service;

import main.com.spring.training.domain.Employee;
import main.com.spring.training.repository.EmployeeRepository;
import main.com.spring.training.repository.HibernateEmployeeRepositoryImpl;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    EmployeeRepository employeeRepository;

    /*public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }*/

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees(){
        return employeeRepository.getAllEmployees();
    }

}
