package programmers.level1;

public class _68935 {
    /*
    * 68935
    * 3진법 뒤집기
    * */
    public int solution(int n) {
        String third = Integer.toString(n, 3);
        int answer = 0;

        for (int i = 0; i < third.length(); i++) {
            answer += (int)Math.pow(3, i) * (third.charAt(i) - '0');
        }

        return answer;
    }
}
