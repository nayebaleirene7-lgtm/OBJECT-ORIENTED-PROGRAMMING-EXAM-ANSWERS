public class Staff {
    protected String staffNo;
    protected String staffName;
    protected int staffAge;

    public Staff(String staffNo, String staffName, int staffAge) {
        this.staffNo = staffNo;
        this.staffName = staffName;
        this.staffAge = staffAge;
    }

    // Instance method that takes no arguments and returns nothing
    public void display() {
        System.out.println("Staff No : " + staffNo);
        System.out.println("Name     : " + staffName);
        System.out.println("Age      : " + staffAge);
    }
}
