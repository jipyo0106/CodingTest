package programmers.level1;

import java.util.Arrays;

public class _12917 {
    /*
    * 문자열 내림차순으로 배치하기
    * https://programmers.co.kr/learn/courses/30/lessons/12917
    * */
    public String solution(String s) {
        char[] toArray = s.toCharArray();
        Arrays.sort(toArray);
        char temp = 0;
        for (int i = 0; i < toArray.length / 2; i++)  {
            temp = toArray[i];
            toArray[i] = toArray[(toArray.length - 1) - i];
            toArray[(toArray.length - 1) - i] = temp;
        }
        return String.valueOf(toArray);
    }

    public String solution2(String s) {
        char[] toArray = s.toCharArray();
        Arrays.sort(toArray);

        return new StringBuilder(new String(toArray)).reverse().toString();

    }
}
