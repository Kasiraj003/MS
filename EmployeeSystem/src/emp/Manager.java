package emp;

public class Manager implements Employee {
	
	private double baseSalary;
	
	public Manager(double baseSalary) {
		
		this.baseSalary = baseSalary;
	}
	
	@Override
    public void work() {
        System.out.println("Manager is handling the team and projects.");
    }

    @Override
    public double calculateSalary() {
        return baseSalary + 4500; // Bonus for Manager
    }
}
