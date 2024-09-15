package lesson4.SW;

//arrayFront9([1, 2, 9, 3, 4]) → true
//arrayFront9([1, 2, 3, 4, 9]
public class SW4 {
    public static void main(String[] args) {
        SW4 sw4 = new SW4();
        int[] array1 = {1, 2, 9, 3, 4};
        int[] array2 = {1, 2, 3, 4, 9};
        boolean result1 = sw4.arrayFront9(array1);
        boolean result2 = sw4.arrayFront9(array2);

        System.out.println(result1);
        System.out.println(result2);
        // я потом подсматрела что эту часть можно было написать поэлегантнее но исправлять уже не стала
    }

    public boolean arrayFront9(int[] nums) {
        int loopLimit = Math.min(nums.length, 4);

        for (int i = 0; i < loopLimit; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
        //надо будет еще раз обсудить логическую цепочку тут
    }
}
