package baekjoon;

import java.io.*;

public class _9012 {
    /*
    * 괄호
    * https://www.acmicpc.net/problem/9012
    * */
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(reader.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            count = 0;
            String str = reader.readLine();

            if (str.length() % 2 != 0) {
                writer.write("NO\n");
                continue;
            }

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(')
                    count++;
                else
                    count--;

                if (count < 0)
                    break;
            }

            writer.write((count == 0) ? "YES\n" : "NO\n");
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}
