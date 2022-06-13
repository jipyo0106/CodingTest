package leetcode.easy;

import java.util.HashMap;
import java.util.Arrays;

public class Two_Sum {
    /*
    * Two Sum
    * https://leetcode.com/problems/two-sum/
    */
    // my write answer
    public int[] solution(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j)
                    continue;

                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }

        Arrays.sort(result);
        return result;
    }

    // anthor person answer
    // [Reference]
    // https://www.code-recipe.com/post/two-sum
    // https://leetcode.com/problems/two-sum/discuss/2145377/100-OPTIMAL-SOLUTION-FOR-JAVA
    public int[] solution2(int[] nums, int target) {
        HashMap<Integer, Integer> idxMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int requiredNum = target - nums[i];
            if (idxMap.containsKey(requiredNum))
                return new int[] {idxMap.get(requiredNum), i};
            idxMap.put(nums[i], i);
        }
        throw new IllegalStateException("No Pair Index");
    }
}
