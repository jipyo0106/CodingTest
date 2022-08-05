package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class _1764 {
    /*
    * 듣보잡
    * https://www.acmicpc.net/problem/1764
    * */
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();

        String[] nm = reader.readLine().split(" ");
        int n = Integer.valueOf(nm[0]),
                m = Integer.valueOf(nm[1]);

        // 듣도 못한 사람
        for (int i = 0; i < n; i++) {
            set.add(reader.readLine());
        }
        // 보도 못한 사람
        for (int i = 0; i < m; i++) {
            String str = reader.readLine();
            if (set.contains(str)) {
                list.add(str);
            }
        }
        Collections.sort(list);
        System.out.print(list.size() + "\n");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + '\n');
        }

        reader.close();
    }
}
