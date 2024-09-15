package lesson6;

public class Accountant extends Employees {

    public Accountant(String name, int ID,  String dateOfBirth,  String address) {
        super(name, ID, Const.ACCOUNTANT_TYPE, dateOfBirth, Const.ACCOUNTANT_SALARY, address);
    }

    public void creatReport(){
        System.out.println("Report was created");
    }
}