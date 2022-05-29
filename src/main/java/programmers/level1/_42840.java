package programmers.level1;

public class _42840 {
    /*
    * 모의고사
    * https://programmers.co.kr/learn/courses/30/lessons/42840
    * */
    private final int n = 3;
    public int[] solution(int[] answers) {
        int[] answer;

        int[] person = new int[n];
        int[] temp1 = {1, 2, 3, 4, 5},
                temp2 = {2, 1, 2, 3, 2, 4, 2, 5},
                temp3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        for (int i = 0; i < answers.length; i++) {
            // 1번 수포자
            if (answers[i] == temp1[i % 5])
                person[0]++;

            // 2번 수포자
            if (answers[i] == temp2[i % 8])
                person[1]++;

            // 3번 수포자
            if (answers[i] == temp3[i % 10])
                person[2]++;
        }

        int max = person[0];
        for (int p : person) {
            if (p > max)
                max = p;
        }

        int count = 0;
        for (int p : person) {
            if (p == max)
                count++;
        }

        answer = new int[count];
        int j = 0;
        for (int i = 0 ; i < person.length; i++) {
            if (person[i] == max)
                answer[j++] = i + 1;
        }

        return answer;
    }
}
