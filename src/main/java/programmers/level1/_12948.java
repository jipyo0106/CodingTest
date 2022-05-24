package programmers.level1;

public class _12948 {
    /*
    * 핸드폰 번호 가리기
    * https://programmers.co.kr/learn/courses/30/lessons/12948
    * */
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        int len = phone_number.length();

        for (int i = 0; i < len; i++) {
            if (i  < len - 4)
                answer.append('*');
            else
                answer.append(phone_number.charAt(i));
        }
        return answer.toString();
    }
}
