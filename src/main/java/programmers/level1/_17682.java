package programmers.level1;

import java.util.StringTokenizer;

public class _17682 {
    /*
    * [1차] 다트 게임
    * https://school.programmers.co.kr/learn/courses/30/lessons/17682
    * */
    public int solution(String dartResult) {
        StringTokenizer token = new StringTokenizer(dartResult, "SDT*#", true);
        int[] answer = new int[3];
        int i = -1;
        while (token.hasMoreTokens()) {
            String s = token.nextToken();

            switch (s) {
                case "#":
                    answer[i] *= -1;
                    break;
                case "*":
                    answer[i] *= 2;

                    if (i != 0)
                        answer[i - 1] *= 2;
                    break;
                case "S":
                    break;
                case "D":
                    answer[i] *= answer[i];
                    break;
                case "T":
                    answer[i] *= answer[i] * answer[i];
                    break;
                default :
                    answer[++i] = Integer.valueOf(s);
            }
        }
        return answer[0] + answer[1] + answer[2];
    }
}
