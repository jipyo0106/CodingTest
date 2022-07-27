package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11718 {
    /*
    * 그대로 출력하기
    * https://www.acmicpc.net/problem/11718
    *
    * 이것도 똑같은 풀이로
    * '그대로 출력하기2'도 풀린다
    * https://www.acmicpc.net/problem/11719
    * */
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringBuilder builder = new StringBuilder();
        while ((str = reader.readLine()) != null) {
            builder.append(str).append('\n');
        }
        System.out.print(builder.toString());
        reader.close();
    }
}
