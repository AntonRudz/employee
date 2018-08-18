package telran.interfaces;

import java.util.Map;

import telran.dto.Employee;

public interface IEmployee {
	Employee getEmployee(int id);
	Map<Integer,Employee> getAllEmployees();
	boolean addEmployee(Employee employee);
	boolean removeEmployee(int id);
	int computeSalaryBudjet();
	
}
