public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String staffId, String name, double salary) {
        super(staffId, name);
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.monthlySalary = salary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}
