public class Manager extends Employee {
    private double responsibilityAllowance;  

    
    public Manager(String name, String id, double salary, double responsibilityAllowance) {
        super(name, id, salary);  
        this.responsibilityAllowance = responsibilityAllowance;
    }
    @Override
    public double calculateSalary() {
        return getSalary() + responsibilityAllowance;  
    }
}
