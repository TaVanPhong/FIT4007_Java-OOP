public class officeEmployee{
    public class OfficeEmployee extends Employee {
        private double overtimeHours;
        private double overtimeRate;
        public OfficeEmployee(String Name, int Id, double Salary, double overtimeHours, double overtimeRate) {
            super(Name, Id, Salary);
            this.overtimeHours = overtimeHours;
            this.overtimeRate = overtimeRate;
        }
        @Override
        public double calculateSalary() {
            return getSalary() + (overtimeHours * overtimeRate);
        }
    }
}