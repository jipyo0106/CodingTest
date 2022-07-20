package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11721 {
    /*
    * 열 개씩 끊어 출력하기
    * https://www.acmicpc.net/problem/11721
    * */
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        StringBuilder builder = new StringBuilder();
        int repeatCount = line.length() / 10;
        for (int i = 0; i < repeatCount; i++)
            builder.append(line.substring(i * 10, i * 10 + 10) + '\n');

        builder.append(line.substring(repeatCount * 10, repeatCount * 10 + line.length() % 10));

        System.out.print(builder.toString());
    }
}
