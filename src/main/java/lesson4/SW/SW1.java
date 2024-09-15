package lesson4.SW;

public class SW1 {
    public static void main(String[] args) {
        SW1 sw1 = new SW1();
        int[] nums1 = {1, 2, 2, 4};
        int[] nums2 = {1, 2, 4, 2};
        System.out.println(sw1.has22(nums1));
        System.out.println(sw1.has22(nums2));

    }

    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }
}
