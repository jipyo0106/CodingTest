package programmers.level1;

import java.util.Arrays;

public class _12982 {
    /*
    * 예산
    * https://programmers.co.kr/learn/courses/30/lessons/12982
    * */
    public int solution(int[] d, int budget) {
        int totalSum = Arrays.stream(d).sum();
        if (totalSum <= budget)
            return d.length;

        Arrays.sort(d);
        int tempSum = 0;
        int count = 0;
        for (int i = 0; i < d.length; i++) {
            if (tempSum + d[i] <= budget) {
                tempSum += d[i];
                count++;
            }
        }

        return count;
    }
}
