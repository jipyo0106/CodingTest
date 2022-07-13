package programmers.level2;

public class _12909 {
    /*
    * 올바른 괄호
    * https://school.programmers.co.kr/learn/courses/30/lessons/12909
    * */
    boolean solution(String s) {
        int count = 0;

        if (s.length() % 2 != 0)
            return false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                count++;
            else
                count--;

            if (count < 0)
                break;
        }

        return count == 0 ? true : false;
    }
}
