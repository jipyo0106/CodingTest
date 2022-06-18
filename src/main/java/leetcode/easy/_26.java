package leetcode.easy;

public class _26 {
    /*
    * Remove Duplicates from Sorted Array
    * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    * */
    public int solution(int[] nums) {
        int pointIdx = 0,
                changeIdx = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                changeIdx = i + 1;
            else
                nums[pointIdx++] = nums[changeIdx++];
        }
        nums[pointIdx++] = nums[changeIdx];

        return pointIdx;
    }
}
