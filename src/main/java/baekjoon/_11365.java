package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11365 {
    /*
    * !밀비 급일
    * https://www.acmicpc.net/problem/11365
    * */
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        StringBuilder builder = new StringBuilder();
        while (!(str = reader.readLine()).equals("END")) {
            for (int i = str.length() - 1; i >= 0; i--) {
                builder.append(str.charAt(i));
            }
            builder.append('\n');
        }
        System.out.print(builder.toString());
    }
}
