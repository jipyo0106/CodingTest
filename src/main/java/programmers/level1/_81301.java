package programmers.level1;

import java.util.ArrayList;

public class _81301 {
    /*
     * 숫자 문자열과 영단어
     * https://programmers.co.kr/learn/courses/30/lessons/81301
     * */
    public int solution(String s) {
        String[] compare = {"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < compare.length; i++) {
            s = s.replaceAll(compare[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }

}
