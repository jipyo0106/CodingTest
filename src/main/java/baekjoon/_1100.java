package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1100 {
    /*
    * 햐얀 칸
    * https://www.acmicpc.net/problem/1100
    * */
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int whiteBoard = 0;
        for (int i = 0; i < 8; i++) {
            String str = reader.readLine();
            for (int j = 0; j < 8; j++) {
                if (str.charAt(j) == 'F' && (i + j) % 2 == 0) {
                    whiteBoard++;
                }
            }
        }
        System.out.print(whiteBoard);
        reader.close();
    }
}
