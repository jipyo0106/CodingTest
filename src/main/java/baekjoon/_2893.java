package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2893 {
    /*
    * 설탕 배달
    * https://www.acmicpc.net/problem/2839
    * */
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(reader.readLine());
        reader.close();
        boolean isNPrint = true;
        for (int i = n / 5; i >= 0; i--) {
            if ((n - i * 5) % 3 == 0) {
                System.out.print(i + ((n - i * 5) / 3));
                isNPrint = false;
                break;
            }
        }
        if (isNPrint) {
            System.out.print(-1);
        }
    }
}
