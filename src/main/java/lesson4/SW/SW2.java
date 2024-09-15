package lesson4.SW;

public class SW2 {
    public static void main(String[] args) {

        SW2 sw2 = new SW2();
        int[] nums1 = {0, 2, 4};
        int[] nums2 = {1, 2, 3};
        System.out.println(sw2.luck13(nums1));
        System.out.println(sw2.luck13(nums2));

    }

    public boolean luck13(int[] nums) {
        for (int i: nums) {
            if (i == 1 || i == 3) {
                return false;
            }
        }
        return true;
    }

}
