package programmers.level1;

public class _86051 {
    /*
    * 없는 숫자 더하기
    * https://programmers.co.kr/learn/courses/30/lessons/86051
    * */
    public int solution(int[] numbers) {
        int totalSum = 0;
        for (int number:numbers) {
            totalSum += number;
        }
        return 45 - totalSum;
    }
}
