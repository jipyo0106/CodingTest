package leetcode.easy;

public class Palindrome_Number {
    /*
    * Palindrome Number
    * https://leetcode.com/problems/palindrome-number
    * */
    public boolean solution(int x) {
        String s = String.valueOf(x);
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        return true;
    }

    // Other Person Code
    // [Reference]
    // https://www.code-recipe.com/post/palindrome-number
    public boolean solution2(int x) {
        // x가 0이면 false
        // x를 나누었을 때 나머지가 0이면 false
        if (x < 0 || (x != 0 && x % 10 == 0))
            return false;
        int res = 0;
        while (x > res) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        // If x is equal to reversed number then it is a palindrome
        // If x has odd number of digits, dicard the middle digit before comparing with x
        // Example, if x = 23132, at the end of for loop x = 23 and reversedNum = 231
        // So, reversedNum/10 = 23, which is equal to x
        return (x == res || x == res / 10);
    }
}
