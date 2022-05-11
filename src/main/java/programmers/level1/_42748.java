package programmers.level1;

import java.util.stream.IntStream;

public class _42748 {
    /*
     * K번째 수
     * https://programmers.co.kr/learn/courses/30/lessons/42748
     * */
    public int[] solution(int[] array, int[][] commands) {
        int answer[] = new int[commands.length];
        for (int i = 0 ; i < commands.length; i++) {
            int temp[] = IntStream.range(commands[i][0] - 1, commands[i][1])
                    .map(j -> array[j])
                    .sorted()
                    .toArray();
            answer[i] = temp[commands[i][2] - 1];
        }
        return answer;
    }
}
