package INTERFACE;

public class Circle implements Shape{
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double calculateArea() {
         return Math.PI * radius * radius; // Diện tích hình tròn
    }
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; // Chu vi hình tròn
    }
    
     
}
