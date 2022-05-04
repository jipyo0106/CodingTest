package programmers.level1;

public class _77484 {
    /*
     * 로또의 최고 순위와 최저 순위
     * https://programmers.co.kr/learn/courses/30/lessons/77484
     * */
    public int[] solution(int[] lottos, int[] win_nums) {
        final int lottoRankComp = 7;
        int[] answer = new int[2];
        int zeroCount = zeroCounter(lottos);
        int matchCount = matchCounter(lottos, win_nums);

        // 최고 순위
        answer[0] = lottoRankComp - ((zeroCount + matchCount == 0? 1: zeroCount + matchCount));
        // 최저 순위
        answer[1] = lottoRankComp - (matchCount == 0 ? 1 : matchCount);
        return answer;
    }
    private int matchCounter(int[] arr, int[] compare) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < compare.length; j++) {
                if (arr[i] == compare[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    private int zeroCounter(int[] arr) {
        int count = 0;
        for (int number : arr) {
            if (number == 0)
                count++;
        }
        return count;
    }
}
