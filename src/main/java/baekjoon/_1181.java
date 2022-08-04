package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class _1181 {
    /*
    * 단어 정렬
    * https://www.acmicpc.net/problem/1181
    * */

    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(reader.readLine());
        StringBuilder builder = new StringBuilder();
        String[] strArr = new String[n];

        for (int i = 0; i < n; i++)
            strArr[i] = reader.readLine();

        Arrays.sort(strArr, new StringSortCompare());

        String beforeStr = "";

        for (int i = 0; i < n; i++) {
            if (!beforeStr.equals(strArr[i]))
                builder.append(strArr[i]).append('\n');

            beforeStr = strArr[i];
        }

        System.out.print(builder);
    }
}

class StringSortCompare implements Comparator<String> {
    @Override
    public int compare(String  str1, String str2) {
        int length = str1.length() - str2.length();
        if (length == 0) {
            return str1.compareTo(str2);
        }
        return length;
    }
}