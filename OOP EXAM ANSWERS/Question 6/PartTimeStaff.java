import java.util.Scanner;

public class PartTimeStaff extends Staff {
    private int hoursWorked;
    private static final double RATE = 10.0;   // property of the class (not a local variable)

    public PartTimeStaff(String staffNo, String staffName, int staffAge, int hoursWorked) {
        super(staffNo, staffName, staffAge);
        this.hoursWorked = hoursWorked;
    }

    // Net pay after 30 % tax
    public double netPay() {
        double gross = hoursWorked * RATE;
        return gross * 0.70;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Monthly Net Pay : " + netPay());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Staff No: ");
        String no = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Hours worked: ");
        int hrs = sc.nextInt();

        PartTimeStaff p = new PartTimeStaff(no, name, age, hrs);
        p.display();          // calls the overridden method

        sc.close();
    }
}
