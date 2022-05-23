package programmers.level1;

import java.util.ArrayList;

public class _12906 {
    /*
    * 같은 숫자는 싫어
    * https://programmers.co.kr/learn/courses/30/lessons/12906
    * */
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                continue;
            list.add(arr[i]);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
