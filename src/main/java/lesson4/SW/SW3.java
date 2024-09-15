package lesson4.SW;

public class SW3 {
    public static void main(String[] args) {
        SW3 sw3 = new SW3();
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 2, 5};
        int[] nums3 = {5, 2, 3};
        int maxNumber1 = findMax(nums1);
        int maxNumber2 = findMax(nums2);
        int maxNumber3 = findMax(nums3);
        System.out.println(maxNumber1);
        System.out.println(maxNumber2);
        System.out.println(maxNumber3);

    }

    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;}


        }


