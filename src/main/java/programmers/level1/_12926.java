package programmers.level1;

public class _12926 {
    /*
    * 시저 암호
    * https://programmers.co.kr/learn/courses/30/lessons/12926
    * */
    public String solution(String s, int n) {
        char[] charArr = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char ch : charArr) {
            if (ch == ' ')
                builder.append(' ');
            else if ((ch + n > 'z' && (ch >= 'a' && ch <= 'z')) || (ch + n > 'Z' && (ch >= 'A' && ch <= 'Z')))
                builder.append((char)(ch + n - 26));
            else
                builder.append((char)(ch + n));
        }
        return builder.toString();
    }
}
