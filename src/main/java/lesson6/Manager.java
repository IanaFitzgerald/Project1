package lesson6;

public class Manager extends Employees {


    public Manager(String name, int ID, String dateOfBirth, String address) {
        super(name, ID, Const.MANAGER_TYPE, dateOfBirth, Const.MANAGER_SALARY, address);
    }



    public void hire(String employeeName) {
        System.out.println(String.format("The employee %s was hired", employeeName));
    }

    public void fire(String employeeName) {
        System.out.println(String.format("The employee %s was fired", employeeName));
    }

}
