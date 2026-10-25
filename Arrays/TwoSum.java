import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            if (map.containsKey(remaining)) {
                return new int[] { map.get(remaining), i };
            }
            map.put(nums[i], i); // this line was missing
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target);

        if (result.length == 0) {
            System.out.println("No pair found");
        } else {
            System.out.println(result[0] + " " + result[1]); // 0 1
        }
    }
}