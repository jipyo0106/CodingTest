package baekjoon;

import java.util.Scanner;

public class _2675 {
    /*
    * 문자열 반복
    * https://www.acmicpc.net/problem/2675
    * */
    public static void solution() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String str[] = new String[T];
        sc.nextLine();
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }

        for (int i = 0; i < str.length; i++) {
            int iter = str[i].charAt(0) - '0';
            String s = str[i].split(" ")[1];
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < iter; k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
