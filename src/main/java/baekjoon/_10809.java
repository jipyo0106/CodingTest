package baekjoon;

import java.util.Scanner;

public class _10809 {
    /*
    * 알파벳 찾기
    * https://www.acmicpc.net/problem/10809
    * */
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int[] answer = new int[26];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = -1;
        }

        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            if (answer[s.charAt(i) - 97] == -1)
                answer[s.charAt(i) - 97] = i;
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }

    }
}
