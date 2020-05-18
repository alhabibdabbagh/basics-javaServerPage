package demo.jsp.db.service;

import java.util.Set;

import demo.jsp.db.dao.EmployeeDAO;
import demo.jsp.db.dao.model.Employee;

public class EmployeeService {

	private  EmployeeDAO employeeDAO;
	public EmployeeService(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	public Set<Employee> findAll() {
		
		return this.employeeDAO.getAll();
	}
}
