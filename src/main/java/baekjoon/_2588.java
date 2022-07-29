package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2588 {
    /*
    * 곱셈
    * https://www.acmicpc.net/problem/2588
    * */
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.valueOf(reader.readLine()),
                number2 = Integer.valueOf(reader.readLine()),
                sum = number1 * number2;

        for (int i = 0; i < 3; i++) {
            System.out.print(number1 * (number2 % 10) + "\n");
            number2 /= 10;
        }
        System.out.print(sum);
    }
}
