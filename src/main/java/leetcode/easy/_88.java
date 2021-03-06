package leetcode.easy;

public class _88 {
    /*
    * Merge Sorted Array
    * https://leetcode.com/problems/merge-sorted-array/
    * */
    public void solution(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        for (int i = 0; i < nums1.length; i++)
            if (nums1[i] == 0 && n > k)
                nums1[i] = nums2[k++];

        // sorting
        for (int i = 0; i < nums1.length; i++) {
            for (int j = i + 1; j < nums1.length; j++) {
                if (nums1[i] > nums1[j]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[i];
                    nums1[i] = temp;
                }
            }
        }
    }
}
