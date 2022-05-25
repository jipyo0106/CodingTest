package programmers.level1;

import java.util.Arrays;

public class _12933 {
    /*
    * 정수 내림차순으로 배치하기
    * https://programmers.co.kr/learn/courses/30/lessons/12933
    * */
    public long solution(long n) {
        long answer = 0;
        char[] temp = String.valueOf(n).toCharArray();
        Arrays.sort(temp);

        for (int i = temp.length - 1; i >= 0; i--) {
            answer += Math.pow(10, i) * (temp[i] - '0');
        }
        return answer;
    }
}
