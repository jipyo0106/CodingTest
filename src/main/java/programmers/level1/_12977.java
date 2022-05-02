package programmers.level1;

public class _12977 {
    /*
    * 소수 만들기
    * https://programmers.co.kr/learn/courses/30/lessons/12977?language=java
    * */
    public int solution(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (!isSosu(nums[i] + nums[j] + nums[k]))
                        count++;
                }
            }
        }
        return count;
    }

    private boolean isSosu(int number) {
        boolean result = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = true;
                break;
            }
        }
        return result;
    }
}
