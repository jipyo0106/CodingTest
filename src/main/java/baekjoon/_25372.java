package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _25372 {
    /*
    * 성택이의 은밀한 비밀번호
    * https://www.acmicpc.net/submit/25372
    * */
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(reader.readLine());

        for (int i = 0; i < n; i++) {
            int length = reader.readLine().length();

            System.out.print(length > 9 || length < 6 ? "no\n" : "yes\n");
        }
        reader.close();
    }
}
