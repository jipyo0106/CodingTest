package programmers.level1;

public class _12922 {
    /*
    * 수박수박수박수박수박수?
    * https://programmers.co.kr/learn/courses/30/lessons/12922
    * */
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        for(int i = 1; i <= n; i++) {
            answer.append(i % 2 == 0 ? "박" : "수");
        }
        return answer.toString();
    }
}
