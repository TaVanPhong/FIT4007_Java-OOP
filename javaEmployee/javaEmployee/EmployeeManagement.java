import java.util.ArrayList;
public class EmployeeManagement {
    public static void main(String[] args) {      
        ArrayList<Employee> employeeList = new ArrayList<>();      
        employeeList.add(new OfficeEmployee("Nguyen Van A", "001", 3000, 10, 50)); 
        employeeList.add(new ProductionEmployee("Le Thi B", "002", 2500, 200, 10)); 
        employeeList.add(new Manager("Tran Van C", "003", 5000, 1500)); 
        for (Employee emp : employeeList) {
            emp.displayInfo();
            System.out.println("Total Salary: " + emp.calculateSalary());
            System.out.println("---------------------------------");
        }
    }
}

