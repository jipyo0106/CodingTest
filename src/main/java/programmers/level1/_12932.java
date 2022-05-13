package programmers.level1;

public class _12932 {
    /*
    * 자연수 뒤집어 배열로 만들기
    * https://programmers.co.kr/learn/courses/30/lessons/12932
    * */
    public int[] solution(long n) {
        String int_ = String.valueOf(n);
        int[] answer = new int[int_.length()];

        for (int i = 0; i < int_.length(); i++) {
            answer[int_.length() - i - 1] = int_.charAt(i) - '0';
        }

        return answer;
    }
}
