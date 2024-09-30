public class ProductionEmployee extends Employee {
    private int productQuantity;   
    private double productPrice;   
    public ProductionEmployee(String name, String id, double salary, int productQuantity, double productPrice) {
        super(name, id, salary);  
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
    }
    @Override
    public double calculateSalary() {
        return getSalary() + (productQuantity * productPrice);  
    }
}
