public class PayrollTest {
    public static void main(String[] args) {
        Payable[] staff = {
            new SalariedEmployee("VU/045", "Atim Rose", 2500000),
            new HourlyEmployee("VU/112", "Ssemakula Ivan", 120, 15000)
        };

        double total = 0;
        for (Payable p : staff) {
            double pay = p.getPaymentAmount();
            System.out.println(pay);
            total += pay;
        }
        System.out.println("Total payroll: " + total);
    }
}
