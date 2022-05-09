package programmers.level1;

public class _12947 {
    /*
    * 하샤드 수
    * https://programmers.co.kr/learn/courses/30/lessons/12947
    * */
    public boolean solution(int x) {
        int digitSum = 0;
        String digit = String.valueOf(x);
        for (int i = 0; i < digit.length(); i++) {
            digitSum += digit.charAt(i) - '0';
        }

        return (x % digitSum == 0) ? true : false;
    }
}
