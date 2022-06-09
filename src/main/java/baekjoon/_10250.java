package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class _10250 {
    /*
    * ACM 호텔
    * https://www.acmicpc.net/problem/10250
    * */
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.valueOf(reader.readLine());
        for (int i = 0; i < num; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

            int h = Integer.valueOf(tokenizer.nextToken());
            int w = Integer.valueOf(tokenizer.nextToken());
            int n = Integer.valueOf(tokenizer.nextToken());

            int result = 0;

            if (n % h == 0) {
                result = h * 100;
                result += n / h;
            }
            else {
                result = (n % h) * 100;
                result += n / h + 1;
            }
            writer.write(result + "\n");
        }
        writer.flush();
        writer.close();
        reader.close();
    }
}
