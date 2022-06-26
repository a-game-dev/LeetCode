class RunningSum {

    /**
     * Given an array nums. We define a running sum of an array as runningSum[i] =
     * sum(nums[0]…nums[i]).
     * 
     * Return the running sum of nums.
     * 
     * 
     * @param nums int array
     * @return int array
     */
    public int[] runningSum(int[] nums) {
        int ps = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ps += nums[i];
            nums[i] = ps;
        }
        return nums;
    }

    /**
     * link = https://leetcode.com/problems/running-sum-of-1d-array/
     * 1480. Running Sum of 1d Array
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4 };
        Print(nums);
        RunningSum rs = new RunningSum();
        nums = rs.runningSum(nums);
        Print(nums);
    }

    public static void Print(int[] nums) {
        System.out.print("content of array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
    }
}