class KadanesAlgorithm{
    public static void main (String[] agr){
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = kadane(arr);
        System.out.println(maxSum);

    }

    public static int kadane(int[] arr){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum += arr[i];
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}