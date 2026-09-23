package leetcode_Daily;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int LargestSubarray = Integer.MIN_VALUE;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            map.put(sum, i);
        }

        int target = sum - x;
        sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            int findSum = sum - target;

            if (map.containsKey(findSum)) {
                int index = map.get(findSum);
                LargestSubarray =
                    Math.max(LargestSubarray, i - index);
            }
        }

        return LargestSubarray == Integer.MIN_VALUE
                ? -1
                : n - LargestSubarray;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 4, 2, 3};
        int x = 5;

        Solution obj = new Solution();

        System.out.println(obj.minOperations(nums, x));
    }
}