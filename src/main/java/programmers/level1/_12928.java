package programmers.level1;

public class _12928 {
    /*
    * 약수의 합
    * https://programmers.co.kr/learn/courses/30/lessons/12928
    * */
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                answer += i;
        }
        return answer;
    }
}
