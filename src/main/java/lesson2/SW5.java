package lesson2;

public class SW5 {
    public static void main(String[] args) {
        answerCell(false, false, false); // true
        answerCell(false, false, true);  // false
        answerCell(true, false, false);  // false
    }

    public static void answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            System.out.println(false);
        } else if (isMorning && !isMom) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}
