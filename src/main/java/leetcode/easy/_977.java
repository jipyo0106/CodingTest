package leetcode.easy;

public class _977 {
    /*
    * Squares of a Sorted Array
    * https://leetcode.com/problems/squares-of-a-sorted-array/
    * */
    public int[] solution(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] * nums[i];
        }
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    // other writer
    // O(n) 풀이
    // https://leetcode.com/problems/squares-of-a-sorted-array/discuss/2140104/0ms-oror-O(n)-oror-Java-oror-Two-Pointer
    public int[] solution2(int[] nums) {
        int start = 0,
                end = nums.length - 1,
                i = end;
        int[] arr = new int[end + 1];

        while (start <= end) {
            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                arr[i] = nums[start] * nums[start];
                start++;
            }
            else {
                arr[i] = nums[end] * nums[end];
                end--;
            }
            i--;
        }
        return arr;
    }
}
