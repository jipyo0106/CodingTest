package baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _1152 {
    public void solution() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(s);

        System.out.println(tokenizer.countTokens());
    }
}
