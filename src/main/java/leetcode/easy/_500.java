package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;

public class _500 {
    /*
     * Keyboard Row
     * https://leetcode.com/problems/keyboard-row/
     * */
    public String[] solution(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        String keyBoard1 = "qwertyuiopQWERTYUIOP";
        String keyBoard2 = "asdfghjklASDFGHJKL";
        String keyBoard3 = "zxcvbnmZXCVBNM";

        for (char alpha : keyBoard1.toCharArray())
            map.put(alpha, 1);

        for (char alpha : keyBoard2.toCharArray())
            map.put(alpha, 2);

        for (char alpha : keyBoard3.toCharArray())
            map.put(alpha, 3);

        for (String word : words) {
            int rowNum = map.get(word.charAt(0));
            boolean isMatch = false;
            for (int i = 1; i < word.length(); i++) {
                if (map.get(word.charAt(i)) != rowNum) {
                    isMatch = true;
                    break;
                }
            }
            if (!isMatch)
                list.add(word);
        }

        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++)
            result[i] = list.get(i);

        return result;
    }
}
