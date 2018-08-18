package telran.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import telran.dto.Employee;
import telran.interfaces.IEmployee;
@Service
public class EmployeeMaps implements IEmployee {
	HashMap<Integer, Employee> employees=new HashMap<>();
	@Override
	synchronized public Employee getEmployee(int id) {
		return employees.get(id);
	}

	@Override
	synchronized public Map<Integer, Employee> getAllEmployees() {
		
		return new HashMap<Integer,Employee>(employees);
	}

	@Override
	synchronized public boolean addEmployee(Employee employee) {
		
		return employees.putIfAbsent(employee.id, employee)==null;
	}

	@Override
	synchronized public boolean removeEmployee(int id) {
		Employee employee=employees.get(id);
		return employees.remove(id, employee);
	}

	@Override
	synchronized public int computeSalaryBudjet() {
		if(employees.size()==0) return 0;
		int budget=employees.values().stream().mapToInt(Employee::getSalary).sum();
		return budget;
	}

}
