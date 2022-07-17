package baekjoon;

import java.io.*;

public class _8958 {
    /*
    * OX퀴즈
    * https://www.acmicpc.net/problem/8958
    * */
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.valueOf(reader.readLine());
        for (int i = 0; i < num; i++) {
            String ox = reader.readLine();
            int score = 0,
                    increaseNum = 0;
            for (int j = 0; j < ox.length(); j++) {
                score += (ox.charAt(j) == 'X') ? increaseNum = 0 : ++ increaseNum;
            }
            writer.write(String.valueOf(score));
            writer.write('\n');
        }
        writer.flush();
        writer.close();
        reader.close();
    }
}
