package lesson4;

public class Homework1 {
    public static void main(String[] args) {
        String result = getDay(5);

        System.out.println(result);

    }
    public static String getDay(int day) {
        String[] array = new String[7];
        array[0] = "Sunday";
        array[1] = "Monday";
        array[2] = "Tuesday";
        array[3] = "Wednesday";
        array[4] = "Thursday";
        array[5] = "Friday";
        array[6] = "Saturday";

        if (day >= 1 && day <= 7) {
            return array[day - 1];
        } else {
            return "Invalid day";
        }
    }
}

