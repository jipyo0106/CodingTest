package programmers.level1;

public class _12921 {
    /*
    * 소수 찾기
    * https://programmers.co.kr/learn/courses/30/lessons/12921
    * */
    public int solution(int n) {
        boolean[] num = new boolean[n + 1];
        int count = 0;
        for (int i = 2; i < num.length; i++) {
            if (num[i])
                continue;
            if (!num[i]) {
                count++;
                for (int j = 1; i * j < num.length; j++) {
                    if (!num[i * j])
                        num[i * j] = true;
                }
            }
        }

        return count;
    }
}
