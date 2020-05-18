package demo.jsp.bundle.servlet;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.jsp.db.dao.EmployeeDAO;
import demo.jsp.db.dao.model.Employee;
import demo.jsp.db.service.EmployeeService;

@WebServlet(name = "EmployeeServlet",urlPatterns = "/employee" )
public class EmployeeServlet  extends HttpServlet{

	private static final long serialVersionUID = 1L;

	
	private EmployeeService employeeService;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Set<Employee> employees = employeeService.findAll();
		req.setAttribute("employees", employees);
        req.getRequestDispatcher("employee_list.jsp").forward(req, resp);
	}
	@Override
	public void init() throws ServletException {
	 employeeService=new EmployeeService(new EmployeeDAO());
		
	}
	
	
	@Override
	public void destroy() {
		employeeService = null;
	}
}
