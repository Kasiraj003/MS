package emp;

public class Developer implements Employee {
	
	 private double baseSalary;

	    public Developer (double baseSalary){
	        this.baseSalary = baseSalary;
	    }

	    @Override
	    public void work() {
	        System.out.println("Developer is writing and debugging code.");
	    }

	    @Override
	    public double calculateSalary() {
	        return baseSalary + 3000; // Bonus for Developer
	        
	    }
}
