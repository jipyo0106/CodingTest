package baekjoon;

import java.util.Scanner;

public class _1157 {
    /*
    * 단어 공부
    * https://www.acmicpc.net/problem/1157
    * */
    public void solution() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toUpperCase();


        int[] alpha = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 65]++;
        }

        int max = 0;
        for (int al : alpha)
            if (al > max)
                max = al;

        char answer = 0;
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] == max) {
                if (answer != 0) {
                    answer = '?';
                    break;
                }
                answer = (char) (i + 65);
            }
        }

        System.out.println(answer);
    }
}
