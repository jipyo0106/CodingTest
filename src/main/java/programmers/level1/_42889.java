package programmers.level1;

public class _42889 {
    /*
    * 실패율
    * https://programmers.co.kr/learn/courses/30/lessons/42889
    * */
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] tAnswer = new double[N];

        int restMember = stages.length;

        for (int i = 0; i < answer.length; i++) {
            if (restMember == 0)
                break;
            int count = 0;
            for (int stage : stages) {
                if (stage == i + 1)
                    count++;
            }
            tAnswer[i] = (double) count / restMember;
            restMember -= count;
        }
        for (int i = 0; i < answer.length; i++) {
            double max = tAnswer[0];
            int idx = 0;
            for (int j = 0; j < tAnswer.length; j++) {
                if (max < tAnswer[j]) {
                    max = tAnswer[j];
                    idx = j;
                }
            }
            tAnswer[idx] = -1;
            answer[i] = idx + 1;
        }
        return answer;
    }
}
