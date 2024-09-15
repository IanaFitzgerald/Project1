package lesson3.SW;

public class StringTimes {
    public static void main(String[] args) {
        String result = stringTimes("Hi", 3);
        String result2 = stringTimes("Hi", 2);
        System.out.println(result);
        System.out.println(result2);
    }

    public static String stringTimes(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
