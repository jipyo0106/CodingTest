package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11047 {
    /*
    * 동전 0
    * https://www.acmicpc.net/problem/11047
    * */
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] temp = reader.readLine().split(" ");
        int n = Integer.valueOf(temp[0]),
                k = Integer.valueOf(temp[1]);
        int i = 0,
                answer = 0;
        int arr[] = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = Integer.valueOf(reader.readLine());
        }

        while (k > 0) {
            for (i = n - 1; i > 0; i--) {
                if (k - arr[i] >= 0)
                    break;
                else
                    continue;
            }
            k -= arr[i];
            answer++;
        }
        System.out.println(answer);
    }
}
