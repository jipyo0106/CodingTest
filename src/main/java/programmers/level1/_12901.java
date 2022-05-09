package programmers.level1;

public class _12901 {
    /*
    * 2016년
    * https://programmers.co.kr/learn/courses/30/lessons/12901
    * */
    public String solution(int a, int b) {
        String[] weeks = {"THU", "FRI", "SAT", "SUN", "MON", "TUE" ,"WED"};
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day = 0;
        for (int i = 1; i < a; i++) {
            day += months[i - 1];
        }
        day += b;

        return weeks[day % 7];
    }
}
