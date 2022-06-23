package programmers.level1;

public class _12940 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        // 두 수가 같은 경우
        if (n == m) {
            answer[1] = answer[0] = n;
            return answer;
        }

        // 최대 공약수
        for (int i = 1; i <= n && i <= m; i++)
            if (n % i == 0 && m % i == 0)
                answer[0] = i;

        // 최소 공배수
        int smaller = (n > m) ? m : n;
        for (int i = n * m; i > smaller; i--)
            if (i % n == 0 && i % m == 0)
                answer[1] = i;

        return answer;
    }

    public int[] solution2(int n, int m) {
        int[] answer = new int[2];

        // 두 수가 같은 경우
        if (n == m) {
            answer[1] = answer[0] = n;
            return answer;
        }

        // 최대 공약수
        for (int i = 1; i <= n && i <= m; i++)
            if (n % i == 0 && m % i == 0)
                answer[0] = i;

        // 최소 공배수
        answer[1] = (n * m) / answer[0];

        return answer;
    }
}
