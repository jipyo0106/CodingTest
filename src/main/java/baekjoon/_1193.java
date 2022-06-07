package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1193 {
    /*
    * 분수찾기
    * https://www.acmicpc.net/problem/1193
    * */
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int denominator = 0,
                numerator = 0,
                num = 0,
                iter = 0,
                i = 0;
        num = Integer.parseInt(reader.readLine());

        for (;iter < num;) {
            iter += i++;
        }

        if (i % 2 == 0) {
            numerator = iter - num + 1;
            denominator = i - numerator;
        }
        else {
            denominator = iter - num + 1;
            numerator = i - denominator;
        }

        System.out.println(numerator + "/" + denominator);
    }
}
