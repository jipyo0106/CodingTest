package programmers.level2;

public class _12945 {
    /*
    * 피보나치 수
    * https://programmers.co.kr/learn/courses/30/lessons/12945
    *
    * 참고 : https://programmers.co.kr/questions/11969
    * */
    public int solution(int n) {
        int before = 0, now = 1;
        for (int i = 2; i <= n; i++) {
            int after = before + now;

            before = now;
            now = after % 1234567;
        }

        return now;
    }
}
