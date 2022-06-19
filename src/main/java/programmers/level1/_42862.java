package programmers.level1;

import java.util.Arrays;

public class _42862 {
    /*
    * 체육복
    * https://programmers.co.kr/learn/courses/30/lessons/42862
    * */
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    reserve[i] = -1;
                    lost[j] = -1;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            if (lost[i] == -1)
                continue;
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    reserve[j] = -1;
                    lost[i] = -1;
                }
            }
        }

        for (int losted : lost)
            if (losted != -1)
                answer--;

        return answer;
    }
}
