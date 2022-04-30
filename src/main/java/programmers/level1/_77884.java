package programmers.level1;

public class _77884 {
    /*
     * 약수의 개수와 덧셈
     * https://programmers.co.kr/learn/courses/30/lessons/77884
     * */
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int temp = checkDivisor(i);
            answer += (temp % 2 == 0) ? (i) : (-i);
        }
        return answer;
    }

    private int checkDivisor(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                count++;
        }
        return count;
    }
}
