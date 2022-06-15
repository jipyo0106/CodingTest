package leetcode.medium;

public class _1170 {
    /*
    * Compare Strings by Frequency of the Smallest Character
    * https://leetcode.com/problems/compare-strings-by-frequency-of-the-smallest-character
    * */
    public int[] solution(String[] queries, String[] words) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int count = 0,
                    queryCount = 0;

            char queryChar = smallCharCheck(queries[i]);
            for (int j = 0; j < queries[i].length(); j++)
                if (queries[i].charAt(j) == queryChar)
                    queryCount++;

            for (String word : words) {
                int wordCount = 0;
                char wordChar = smallCharCheck(word);

                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(j) == wordChar) {
                        wordCount++;
                        if (queryCount < wordCount) {
                            count++;
                            break;
                        }
                    }
                }
            }
            answer[i] = count;
        }
        return answer;
    }

    private char smallCharCheck(String s) {
        for (char i = 'a'; i <= 'z'; i++)
            if (s.indexOf(i) != -1)
                return i;

        return 0;
    }
}
