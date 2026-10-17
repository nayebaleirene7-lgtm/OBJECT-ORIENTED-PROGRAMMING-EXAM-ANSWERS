import java.util.Scanner;

public class FullTimeStaff extends Staff {
    private double basicSalary;

    public FullTimeStaff(String staffNo, String staffName, int staffAge, double basicSalary) {
        super(staffNo, staffName, staffAge);
        this.basicSalary = basicSalary;
    }

    // Net pay after example statutory deductions of 20 %
    public double netPay() {
        return basicSalary * 0.80;
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
        System.out.print("Basic Salary: ");
        double sal = sc.nextDouble();

        FullTimeStaff f = new FullTimeStaff(no, name, age, sal);
        f.display();          // calls the overridden method

        sc.close();
    }
}
