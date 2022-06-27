class RunningSum {

    /**
     * Given an array nums. We define a running sum of an array as runningSum[i] =
     * sum(nums[0]…nums[i]).
     * 
     * Return the running sum of nums.
     * 
     * 
     * @param nums int array
     * @return int
     */
    public int runningSum(int[] nums) {
        int prefixSum = nums[0], leftSum = 0;
        for (int i = 1; i < nums.length; i++) {
            prefixSum += nums[i];
        }
        int rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            leftSum = i == 0 ? 0 : leftSum + nums[i - 1];
            rightSum = prefixSum - leftSum - nums[i];
            System.out.println("i = " + i + ", leftSum = " + leftSum + ", rightSum = " + rightSum);
            if (leftSum == rightSum)
                return i;
        }
        return -1;
    }

    /**
     * link = https://leetcode.com/problems/running-sum-of-1d-array/
     * 1480. Running Sum of 1d Array
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 1, -1 };
        Print(nums);
        RunningSum rs = new RunningSum();
        int ans = rs.runningSum(nums);
        System.out.println("ans = " + ans);
    }

    public static void Print(int[] nums) {
        System.out.print("content of array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
    }
}