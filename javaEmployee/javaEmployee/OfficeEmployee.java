public class OfficeEmployee extends Employee {
    private double overtimeHours;  
    private double overtimeRate;   
    public OfficeEmployee(String name, String id, double salary, double overtimeHours, double overtimeRate) {
        super(name, id, salary);  
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }
    @Override
    public double calculateSalary() {
        return getSalary() + (overtimeHours * overtimeRate);  
    }
}
