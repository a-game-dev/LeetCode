class FindPivotIndex {
    /**
     * Given an array of integers nums, calculate the pivot index of this array.
     * 
     * The pivot index is the index where the sum of all the numbers strictly to the
     * left of the index is equal to the sum of all the numbers strictly to the
     * index's right.
     * 
     * If the index is on the left edge of the array, then the left sum is 0 because
     * there are no elements to the left. This also applies to the right edge of the
     * array.
     * 
     * Return the leftmost pivot index. If no such index exists, return -1.
     * 
     * @param nums
     * @return
     */
    public int pivotIndex(int[] nums) {
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
     * link - https://leetcode.com/problems/find-pivot-index/
     * 724. Find Pivot Index
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 7, 3, 6, 5, 6 };
        Print(nums);
        FindPivotIndex rs = new FindPivotIndex();
        int pivot = rs.pivotIndex(nums);
        System.out.println("pivot index: " + pivot);
    }

    public static void Print(int[] nums) {
        System.out.print("content of array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
    }
}