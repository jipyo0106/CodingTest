package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1929 {
    /*
    * 소수 구하기
    * https://www.acmicpc.net/problem/1929
    * */
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");

        int from = Integer.valueOf(str[0]),
                end = Integer.valueOf(str[1]);

        reader.close();

        boolean[] notPrime = new boolean[end + 1];

        // false : prime number
        // true : not prime number

        notPrime[0] = true;
        notPrime[1] = true;

        for (int i = 2; i * i <= end; i++) {
            if (!notPrime[i]) {
                for (int j = i * i; j <= end; j += i) {
                    notPrime[j] = true;
                }
            }
        }

        StringBuilder builder = new StringBuilder();

        for (int i = from; i <= end; i++) {
            if (!notPrime[i])
                builder.append(i).append('\n');
        }

        System.out.print(builder.toString());
    }
}
