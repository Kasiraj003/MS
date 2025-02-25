package emp;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
	
	private List<Employee> employees;

    public EmployeeManagementSystem() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void showAllEmployees() {
        for (Employee emp : employees) {
            emp.work();
            System.out.println("Salary: Rs." + emp.calculateSalary());
            System.out.println("--------------------------------");
        }
    }
}
