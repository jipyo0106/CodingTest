package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2744 {
    /*
    * 대소문자 바꾸기
    * https://www.acmicpc.net/problem/2744
    * */
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            // Upper case
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                builder.append((char)(str.charAt(i) + 32));
            }
            // Lower case
            else {
                builder.append((char)(str.charAt(i) - 32));
            }
        }
        System.out.print(builder.toString());
    }
}
