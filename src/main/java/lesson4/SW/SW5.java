package lesson4.SW;
import java.util.ArrayList;
import java.util.List;

public class SW5 {
    public static void main(String[] args) {

        List<Integer> nums1 = List.of(1, 2, 3);
        List<Integer> nums2 = List.of(6, 8, -6, -8, 1);

        List<Integer> squared1 = square(nums1);
        List<Integer> squared2 = square(nums2);

        System.out.println(squared1);
        System.out.println(squared2);
    }

    public static List<Integer> square(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            result.add(num * num);
        }

        return result;
    }
}