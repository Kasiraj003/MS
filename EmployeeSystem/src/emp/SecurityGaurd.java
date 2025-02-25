package emp;

public class SecurityGaurd implements Employee{
	
	private double baseSalary;

    public SecurityGaurd(double baseSalary) {
    	this.baseSalary = baseSalary;
    }
    @Override
    public void work() {
        System.out.println("Security Guard is ensuring the security of the premises.");
    }

    @Override
    public double calculateSalary() {
        return baseSalary; // No Bonus
    }
}
