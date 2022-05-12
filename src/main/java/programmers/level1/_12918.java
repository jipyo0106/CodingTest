package programmers.level1;

public class _12918 {
    /*
    * 문자열 다루기 기본
    * https://programmers.co.kr/learn/courses/30/lessons/12918
    *
    * */
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6)
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9')
                return false;
        }
        return true;
    }

    /*
    * !!주의
    * 나는 신박하게 해보고 싶어서 try catch를 썻지만
    * 원래 알고리즘에서는 try catch를 안쓰는 것이 좋다.
    * */
    public boolean solution2(String s) {
        if (s.length() != 4 && s.length() != 6)
            return false;
        try {
            Integer.valueOf(s);
        }
        catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
