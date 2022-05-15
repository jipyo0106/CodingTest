package programmers.level2;

import java.util.Locale;

public class _12951 {
    /*
    * JadenCase 문자열 만들기
    * https://programmers.co.kr/learn/courses/30/lessons/12951
    * */
    public String solution(String s) {
        s = s.toLowerCase();
        boolean emptyCheck = true;
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char indexV = s.charAt(i);

            if (emptyCheck && indexV != ' ') {
                if (indexV >= 'a' && indexV <= 'z')
                    indexV = (char)(indexV - 32);
                emptyCheck = false;
            }
            else if (indexV == ' ') {
                emptyCheck = true;
            }
            builder.append(indexV);

        }
        return builder.toString();
    }

    /* 멋있는 코드... 깔끔하다...*/
    public String solution2(String s) {
         String answer = "";
         String[] sp = s.toLowerCase().split("");
         boolean flag = true;

         for(String ss : sp) {
             answer += flag ? ss.toUpperCase() : ss;
             System.out.println(answer);
             flag = ss.equals(" ") ? true : false;
         }

         return answer;
    }
}
