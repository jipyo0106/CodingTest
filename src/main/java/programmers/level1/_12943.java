package programmers.level1;

public class _12943 {
    /*
    * 콜라츠 추측
    * https://programmers.co.kr/learn/courses/30/lessons/12943
    * */
    public int solution(int num) {
        long numL = num;
        int i = 0;
        for (; i < 500; i++) {
            if (numL == 1)
                return i;

            numL = (numL % 2 == 0) ? numL / 2 : numL * 3 + 1;
        }
        return -1;
    }
}
