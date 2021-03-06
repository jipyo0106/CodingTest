package programmers.level1;

public class _12912 {
    /*
    * 두 정수 사이의 합
    * https://programmers.co.kr/learn/courses/30/lessons/12912
    * */
    public long solution(int a, int b) {
        long answer = 0;
        if (b < a) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i <= b; i++) {
            answer += i;
        }
        return answer;
    }
}
