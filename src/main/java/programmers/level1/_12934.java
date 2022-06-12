package programmers.level1;

public class _12934 {
    /*
    * 정수 제곱근 판별
    * https://programmers.co.kr/learn/courses/30/lessons/12934
    * */
    public long solution(long n) {
        double root = Math.sqrt((double)n);
        long answer = -1;
        if (Math.round(root) == root)
            answer = (long) Math.pow(++root, 2);
        return answer;
    }
}
