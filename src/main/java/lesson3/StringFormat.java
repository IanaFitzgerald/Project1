package lesson3;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Vasya";
        String gender = "male";
        int age = 20;
        double salary = 5000.50;

        System.out.println("The name is " + name + ", gender is " + gender + ", age is " + ", salary is " + salary);

        System.out.println(String.format("The name is %s, the gender is %s, the age is %d, the salary is %f", name, gender,age, salary));
    }
}
