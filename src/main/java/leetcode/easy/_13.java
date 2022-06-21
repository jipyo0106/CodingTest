package leetcode.easy;

import java.util.HashMap;

public class _13 {
    /*
     * Roman to Integer
     * https://leetcode.com/problems/roman-to-integer/
     * */
    public int solution(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();

        hash.put('I', 1);
        hash.put('V', 5);
        hash.put('X', 10);
        hash.put('L', 50);
        hash.put('C', 100);
        hash.put('D', 500);
        hash.put('M', 1000);

        int beforeVal = 0,
                sum = 0;

        for (int i = s.length() - 1; i >= 0 ; i--) {
            int val = hash.get(s.charAt(i));
            if (val < beforeVal) {
                sum -= val;
            } else {
                sum += val;
            }
            beforeVal = val;
        }

        return sum;
    }
}
