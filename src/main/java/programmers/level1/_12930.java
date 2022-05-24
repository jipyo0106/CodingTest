package programmers.level1;

public class _12930 {
    /*
    * 이상한 문자 만들기
    * https://programmers.co.kr/learn/courses/30/lessons/12930
    * */
    public String solution(String s) {
        s += "_";
        StringBuilder answer = new StringBuilder();
        String[] splitStr = s.toLowerCase().split(" ");
        System.out.println(splitStr.length);
        for (String str : splitStr) {
            for(int i = 0; i < str.length(); i++) {
                char temp = (i % 2 == 0) ? (char)(str.charAt(i) - 32) : str.charAt(i);
                answer.append(temp);
            }
            answer.append(' ');
        }
        return answer.substring(0, s.length() - 1);
    }
}
