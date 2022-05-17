package programmers.level2;

public class _12939 {
    /*
    * 최대값과 최소값
    * https://programmers.co.kr/learn/courses/30/lessons/12939
    * */
    public String solution(String s) {
        String[] temp = s.split(" ");
        int min, max;
        min = max = Integer.parseInt(temp[0]);

        for (int i = 1; i < temp.length; i++) {
            int comp = Integer.parseInt(temp[i]);
            if (min > comp)
                min = comp;
            else if (max < comp)
                max = comp;
        }
        return min + " " + max;
    }
}
