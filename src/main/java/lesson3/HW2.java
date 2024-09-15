package lesson3;
//я не смогла засунуть его  в первый класс код не работал ошибку найти не могла:( поэтому сделала отдельно
public class HW2 {
    public static void main(String[] args) {
        String text = "racecar";

        if (isPalindrome(text)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;

                //вот эту часть после while я не поняла - загуглила. надо будт обсудить
            }
            left++;
            right--;
        }

        return true;
    }
}
