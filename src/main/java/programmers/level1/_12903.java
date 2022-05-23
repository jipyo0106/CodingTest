package programmers.level1;

public class _12903 {
    /*
    * 가운데 글자 가져오기
    * https://programmers.co.kr/learn/courses/30/lessons/12903
    * */
    public String solution(String s) {
        int len = s.length();
        return (len % 2 == 0) ? s.substring(len / 2 - 1, len / 2 + 1) : s.substring(len / 2, len / 2 + 1);
    }
}
