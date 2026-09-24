package leetcode_Daily;

class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;

        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (sum >= s) {
                minLength = Math.min(minLength, right - left + 1);
                sum = sum - nums[left];
            left++;
            }
            
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        int s = 7;
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        MinimumSizeSubarraySum obj = new MinimumSizeSubarraySum();
        System.out.println(obj.minSubArrayLen(s, nums));
    }
}