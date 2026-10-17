public class HourlyEmployee extends Employee {
    private int hours;
    private double rate;

    public HourlyEmployee(String staffId, String name, int hours, double rate) {
        super(staffId, name);
        if (hours < 0 || rate < 0) {
            throw new IllegalArgumentException("Hours and rate cannot be negative");
        }
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double calculatePay() {
        return hours * rate;
    }
}
