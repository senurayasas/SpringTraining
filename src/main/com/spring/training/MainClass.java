package main.com.spring.training;

import main.com.spring.training.domain.Employee;
import main.com.spring.training.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class MainClass {

    public static void main(String []args){

        //EmployeeService employeeService = new EmployeeServiceImpl();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService employeeService = applicationContext.getBean("employeeService",EmployeeService.class);
        List<Employee> employeeList = employeeService.getAllEmployees();

        for(Employee employee: employeeList) {
            System.out.println(employee.getEmployeeName()+" - "+employee.getEmployeeLocation());
        }
    }
}
