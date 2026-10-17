public abstract class Employee implements Payable {
    private String staffId;
    private String name;

    public Employee(String staffId, String name) {
        this.staffId = staffId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculatePay();

    @Override
    public double getPaymentAmount() {
        return calculatePay();
    }

    @Override
    public String toString() {
        return staffId + " " + name;
    }
}
