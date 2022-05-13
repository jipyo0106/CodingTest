package programmers.level1;

public class _12925 {
    /*
    * 문자열을 정수로 바꾸기
    * https://programmers.co.kr/learn/courses/30/lessons/12925
    * */
    public int solution(String s) {
        boolean check = false;
        int answer = 0;
        if (s.charAt(0) == '-') {
            s = s.replace("-", "");
            check = true;
        }

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp >= '0' && temp <= '9') {
                temp -= '0';
                answer += temp * (int)Math.pow(10, s.length() - i - 1);
            }
        }

        answer *= (check) ? -1 : 1;

        return answer;
    }

    public int solution2(String s) {
        return Integer.parseInt(s);
    }
}
