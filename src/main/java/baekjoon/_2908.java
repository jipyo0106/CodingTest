package baekjoon;

import java.util.Scanner;

public class _2908 {
    /*
    * 상수
    * https://www.acmicpc.net/problem/2908
    * */
    public void solution() {
        Scanner sc = new Scanner(System.in);
        String a, b;

        a = sc.next();
        b = sc.next();

        String t_result = null;
        for (int i = 2; i > 0; i--) {
            if (a.charAt(i) > b.charAt(i))
                t_result = a;
            else if (a.charAt(i) < b.charAt(i))
                t_result = b;
            else
                continue;

            break;
        }
        int result = 0;
        result += (t_result.charAt(2) - '0') * 100;
        result += (t_result.charAt(1) - '0') * 10;
        result += (t_result.charAt(0) - '0');

        System.out.println(result);
    }
}
