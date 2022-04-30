package programmers.level1;

public class _82612 {
    /*
     * 부족한 금액 계산하기
     * https://programmers.co.kr/learn/courses/30/lessons/82612?language=java
     * */
    public long solution(int price, int money, int count) {
        long moneyLong = money;
        for (int i = 1; i <= count; i++) {
            moneyLong -= price * i;
        }
        long answer = moneyLong >= 0 ? 0 : -moneyLong;
        return answer;
    }
}
