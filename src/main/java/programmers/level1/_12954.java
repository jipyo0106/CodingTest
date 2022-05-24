package programmers.level1;

import java.util.ArrayList;

public class _12954 {
    /*
    * x만큼 간격이 있는 n개의 숫자
    * https://programmers.co.kr/learn/courses/30/lessons/12954
    * */
    public long[] solution(int x, int n) {
        ArrayList<Long> list = new ArrayList<>();
        long temp = 0;
        for (long i = 0; i < n; i++) {
            temp += x;
            list.add(temp);
        }
        long[] answer = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
