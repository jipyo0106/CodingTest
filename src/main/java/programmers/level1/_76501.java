package programmers.level1;

public class _76501 {
    /*
     * 음양 더하기
     * https://programmers.co.kr/learn/courses/30/lessons/76501
     * */
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            answer += (signs[i]) ? absolutes[i] : -absolutes[i];
        }
        return answer;
    }
}
