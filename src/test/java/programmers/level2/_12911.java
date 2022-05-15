package programmers.level2;

public class _12911 {
    /*
    * 다음 큰 숫자
    * https://programmers.co.kr/learn/courses/30/lessons/12911
    * */
    public int solution(int n) {
        String binary = Integer.toBinaryString(n);
        int number1 = count1(binary.toCharArray());
        int count = -1;

        while(number1 != count) {
            n++;
            binary = Integer.toBinaryString(n);
            count = count1(binary.toCharArray());
        }
        return n;
    }

    private int count1(char[] cArr) {
        int count = 0;
        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] == '1')
                count++;
        }
        return count;
    }
}

