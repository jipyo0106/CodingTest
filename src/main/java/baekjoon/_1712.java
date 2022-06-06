package baekjoon;

import java.util.Scanner;

public class _1712 {
    /*
    * 손익분기점
    * https://www.acmicpc.net/problem/1712
    * */
    public void solution() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(),
            b = sc.nextInt(),
            c = sc.nextInt();
        int i = 0,
                temp = 0;
        if (b >= c) {
            System.out.println(-1);
            return;
        }

        for (; temp <= a; i++) {
            temp += c - b;
        }
        System.out.println(i);
    }
}
