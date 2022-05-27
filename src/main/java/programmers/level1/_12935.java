package programmers.level1;

import java.util.ArrayList;

public class _12935 {
    /*
    * 제일 작은 수 제거하기
    * https://programmers.co.kr/learn/courses/30/lessons/12935
    * */
    public int[] solution(int[] arr) {
        int[] answer;
        ArrayList<Integer> list = new ArrayList<>();
        int min = arr[0];

        if (arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            if (arr[i] < min)
                min = arr[i];
        }

        list.remove(list.indexOf(min));
        answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
