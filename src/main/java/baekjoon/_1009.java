package baekjoon;

import java.io.*;

public class _1009 {
    /*
    * 분산처리
    * https://www.acmicpc.net/problem/1009
    * */
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.valueOf(reader.readLine());
        int[] buf = new int[4];
        for (int i = 0; i < count; i++) {
            String s[] = reader.readLine().split(" ");
            int a = Integer.valueOf(s[0]),
                b = Integer.valueOf(s[1]) - 1,
                pow = a;
            for (int j = 0; j < buf.length; j++) {
                if ((pow %= 10) == 0)
                    pow = 10;
                buf[j] = pow;
                pow *= a;
            }
            writer.write(buf[b % buf.length] + "\n");
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}
