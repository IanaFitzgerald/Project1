package lesson3.SW;

public class GdogG {
    public static void main(String[] args) {
        String str = "Boss";

        if (str.length() > 0) {
            char lastChar = str.charAt(str.length() - 1);
            String result = lastChar + str + lastChar;

            System.out.println("Original string: " + str);
            System.out.println("New string: " + result);
        } else {
            System.out.println("String is empty.");
        }
    }

}

