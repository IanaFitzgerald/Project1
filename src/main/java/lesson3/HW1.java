package lesson3;

public class HW1 {
    public static void main(String[] args) {
        HW1 homework1 = new HW1();
        homework1.compareStrings();

    }

    public void compareStrings() {
        String a = "Catalog";
        String b = "Cat";

        if (a == null || b == null) {
            System.out.println("Cannot compare Strings");
        } else if (a.contains(b)) {
            System.out.println("True");
        } else if (a.equals(b)) {
            System.out.println("The Strings are the same");
// спросить Бориса это ли он имел ввиду (!a.equals(b)) когда говорил что добавил на случай если оба текста разные
        } else if (!a.equals(b)) {
            System.out.println("The Strings are NOT the same");}


    }
}