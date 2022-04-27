package programmers.level1;

public class _12931 {
    /*
     * 자릿수 더하기
     * https://programmers.co.kr/learn/courses/30/lessons/12931
     * */
    public int solution(int n) {
        int answer = 0;
        answer += n % 10;
        while (n != 0) {
            n /= 10;
            answer += n % 10;
        }
        return answer;
    }
}
