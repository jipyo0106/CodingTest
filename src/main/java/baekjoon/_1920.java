package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class _1920 {
    /*
    * 수 찾기
    * https://www.acmicpc.net/problem/1920
    * */
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();

        int n = Integer.valueOf(reader.readLine());
        String[] str1 = reader.readLine().split(" ");
        int m = Integer.valueOf(reader.readLine());
        String[] str2 = reader.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            map.put(str1[i], 1);
        }

        for (int i = 0; i < m; i++) {
            builder.append( map.containsKey(str2[i]) ? 1 : 0).append('\n');
        }

        System.out.print(builder.toString());
        reader.close();
    }
}
