package emp;

public class Main {
	
	public static void main(String[] args) {
		
        Employee manager = new Manager(50000);
        Employee developer = new Developer(40000);
        Employee securityGuard = new SecurityGaurd(25000);

        EmployeeManagementSystem system = new EmployeeManagementSystem();
        system.addEmployee(manager);
        system.addEmployee(developer);
        system.addEmployee(securityGuard);

        system.showAllEmployees();
        
    }
}
