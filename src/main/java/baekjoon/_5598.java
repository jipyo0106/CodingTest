package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5598 {
    /*
    * 카이사르 암호
    * https://www.acmicpc.net/problem/5598
    * */
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String caesarString = reader.readLine();

        for (int i = 0; i < caesarString.length(); i++) {
            builder.append((char) (caesarString.charAt(i) > 'C' ? caesarString.charAt(i) - 3 : caesarString.charAt(i) + 23));
        }
        System.out.print(builder.toString());
        reader.readLine();
    }
}
