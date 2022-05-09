package programmers.level1;

public class _12919 {
    /*
    * 서울에서 김서방 찾기
    * https://programmers.co.kr/learn/courses/30/lessons/12919
    * */

    public String solution(String[] seoul) {
        int i = 0;
        for (; i< seoul.length; i++) {
            if (seoul[i].equals("Kim"))
                break;
        }
        return "김서방은 " + i + "에 있다";
    }
}
