package programmers.level1;

public class _12916 {
    /*
    * 문자열 내 p와 y의 개수
    * https://programmers.co.kr/learn/courses/30/lessons/12916
    * */
    boolean solution(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'P' || s.charAt(i) == 'p')
                count++;
            else if (s.charAt(i) == 'Y' || s.charAt(i) == 'y')
                count--;
        }
        return count == 0 ? true : false;
    }

}
