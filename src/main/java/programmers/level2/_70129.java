package programmers.level2;

public class _70129 {
    /*
    * 이진 변환 반복하기
    * https://school.programmers.co.kr/learn/courses/30/lessons/70129
    * */
    public int[] solution(String s) {
        int[] answer = new int[2];
        int repeatCount = 0,
                zeroCount = 0;
        do {
            zeroCount = 0;
            for (int i = 0; i < s.length(); i++)
                if (s.charAt(i) == '0')
                    zeroCount++;

            s = Integer.toBinaryString(s.length() - zeroCount);
            answer[1] += zeroCount;
            repeatCount++;
        } while (!s.equals("1"));
        answer[0] = repeatCount;
        return answer;
    }
}
