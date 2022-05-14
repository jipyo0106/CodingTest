package programmers.level1;

import java.util.Arrays;

public class _12944 {
    /*
    * 평균 구하기
    * https://programmers.co.kr/learn/courses/30/lessons/12944
    * */
    public double solution(int[] arr) {
        double answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        answer /= arr.length;

        return answer;
    }

    public double solution2(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }
}
