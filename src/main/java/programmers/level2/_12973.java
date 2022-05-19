package programmers.level2;

import java.util.Stack;

public class _12973 {
    /*
    * 짝지어 제거하기
    * https://programmers.co.kr/learn/courses/30/lessons/12973
    * */
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if (!stack.empty() && stack.peek() == s.charAt(i)) {
                stack.pop();
                continue;
            }

            stack.push(s.charAt(i));
        }
        return stack.empty() ? 1 : 0;
    }
}
