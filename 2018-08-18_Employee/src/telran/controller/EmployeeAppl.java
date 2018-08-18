package telran.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import telran.dto.Employee;
import telran.dto.EmployeeApi;
import telran.interfaces.IEmployee;
@SpringBootApplication
@RestController
@ComponentScan("telran.model")
@CrossOrigin
public class EmployeeAppl {
@Autowired
IEmployee employees;

@PostMapping(value=EmployeeApi.ADD_EMPLOYEE)
boolean addEmployee(@RequestBody Employee employee) {
	return employees.addEmployee(employee);
}
@DeleteMapping(value=EmployeeApi.REMOVE_EMPLOYEE)
boolean removeEmployee(@RequestBody int id) {
	return employees.removeEmployee(id);
}
@GetMapping(value=EmployeeApi.GET_EMPLOYEE)
Employee getEmployee(@RequestBody int id) {
	return employees.getEmployee(id);
}
@GetMapping(value=EmployeeApi.GET_ALL_EMPLOYEES)
Map<Integer, Employee> getAllEmployees(){
	return employees.getAllEmployees(); 
}
@GetMapping(value=EmployeeApi.GET_SALARY_BUDJET)
int getSalaryBudget() {
	return employees.computeSalaryBudjet();
}
public static void main(String[] args) {
	SpringApplication.run
	(EmployeeAppl.class, args);

}

}
