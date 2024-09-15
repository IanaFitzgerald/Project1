package lesson3.SW;

public class Max {
    public static void main(String[] args) {

    }
    public boolean maxStart(String str) {

        if (str.length() >= 3) {

            String start = str.substring(0, 3);
            if (start.charAt(0) == 'm' && start.substring(1).equals("ax")) {
                return true;
            }
        }

        return false;
    }
}
