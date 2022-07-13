package programmers.level2;

import java.util.HashMap;
import java.util.TreeSet;

public class _42586 {
    /*
    * 기능 개발
    * https://school.programmers.co.kr/learn/courses/30/lessons/42586
    * */
    public int[] solution(int[] progresses, int[] speeds) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int days = 1;

        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + speeds[i] * days < 100)
                days++;

            map.put(days, map.containsKey(days) ? map.get(days) + 1 : 1);
        }

        TreeSet<Integer> set = new TreeSet<>(map.keySet());
        int[] answer = new int[set.size()];
        int idx = 0;

        for (Integer release : set)
            answer[idx++] = map.get(release);

        return answer;
    }
}
