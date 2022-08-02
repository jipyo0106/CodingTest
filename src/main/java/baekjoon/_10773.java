package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _10773 {
    /*
    * 제로
    * https://www.acmicpc.net/problem/10773
    * */
    public void solution () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack();
        int n = Integer.valueOf(reader.readLine());
        for (int i = 0; i < n; i++) {
            String s = reader.readLine();

            if(s.equals("0"))
                stack.pop();
            else
                stack.push(s);
        }

        int sum = 0;
        while (!stack.empty()) {
            sum += Integer.valueOf(stack.pop());
        }
        System.out.println(sum);
    }
}
