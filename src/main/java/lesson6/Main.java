package lesson6;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("John Smith", 1, "04/11/1985", "Toronto");
        Clerk clerk1 = new Clerk("Sara Dow", 2, "10/01/1986", "Toronto");
        Accountant accountant1 = new Accountant("Anna Tree", 3, "22/02/1989", "Waterloo");

        System.out.println(manager1.toString());
        System.out.println(clerk1.toString());
        System.out.println(accountant1.toString());

        manager1.fire("Ivan Petrov");
        accountant1.creatReport();
        clerk1.getcall("Patrick Shmidt");

        accountant1.setName("Anna Fix");
        System.out.println(accountant1.toString());
    }}










//Employees emp1 = new Employees("John Smith", 1, "04/11/1985", "Toronto");
//Employees emp2 = new Employees("Sara Dow", 2,  "10/01/1986",  "Toronto");
//Employees emp3 = new Employees("Anna Tree", 3, "22/02/1989", "Waterloo");
//Employees emp4 = new Employees("Sam Glow", 4, "Clerk", "19/06/1990", 3000, "Waterloo");
//Employees emp5 = new Employees("Samantha Lee", 5, "Accountant", "06/06/1990", 5000, "Kitchener");
//Employees emp6 = new Employees("Kim kardashian", 6, "Accountant", "02/12/1984", 5000, "Toronto");
//Employees emp7 = new Employees("Zara Vank", 7, "Accountant", "21/12/1989", 5000, "Cambridge");
//Employees emp8 = new Employees("Ryan Pan", 8, "Accountant", "06/09/1990", 5000, "Cambridge");
//Employees emp9 = new Employees("Trevor Kidd", 9, "Accountant", "12/03/1990", 5000, "Waterloo");
//
//
//emp1.printEmployeesDetails();
//emp2.printEmployeesDetails();
//emp3.printEmployeesDetails();
//emp4.printEmployeesDetails();
//emp5.printEmployeesDetails();
//emp6.printEmployeesDetails();
//emp7.printEmployeesDetails();
//emp8.printEmployeesDetails();
//emp9.printEmployeesDetails();






