package lesson6;

public class Clerk extends Employees {
    public Clerk(String name, int ID, String dateOfBirth, String address) {
        super(name, ID, Const.CLERK_TYPE, dateOfBirth, Const.CLERK_SALARY, address);
    }

    public void makecall (String customerName) {
        System.out.println(String.format("Contact to customer %s", customerName));
    }

    public void getcall (String customerName) {
        System.out.println(String.format("Answered to customer %s", customerName));
    }
}

