package programmers.level1;

public class _72410 {
    /*
    신규 아이디 추천
    https://programmers.co.kr/learn/courses/30/lessons/72410
     */
    public String solution(String new_id) {
        String answer = "";

        // STEP 1
        StringBuilder lower = new StringBuilder(new_id.toLowerCase());

        // STEP 2
        for(int i = 0; i < lower.length(); i++) {
            char temp = lower.charAt(i);
            if (!(temp >= 'a' && temp <= 'z' ||
                    temp >= '0' && temp <= '9' ||
                    temp == '-' ||
                    temp == '_' ||
                    temp == '.')) {
                lower.replace(i, i+1, "");
                i--;
            }

        }

        // STEP 3
        for(int i = 0; i + 1 < lower.length(); i++) {
            if (lower.charAt(i) == '.' &&
                    lower.charAt(i + 1) == '.') {
                lower.deleteCharAt(i + 1);
                i--;
            }
        }

        // STEP 4
        int firstSet = 0;
        if (lower.charAt(firstSet) == '.') {
            lower.deleteCharAt(firstSet);
        }
        int lastSet = lower.length();
        if (lastSet != 0 && lower.charAt(lastSet - 1) == '.') {
            lower.deleteCharAt(lastSet - 1);
        }

        // STEP 5
        if (lower.length() == 0) {
            lower.append('a');
        }

        // STEP 6
        final int lengthOfId = 15;
        if (lower.length() > lengthOfId) {
            lower.setLength(lengthOfId);
            if (lower.charAt(lengthOfId - 1) == '.') {
                lower.deleteCharAt(lengthOfId - 1);
            }
        }
        // STEP 7
        else if (lower.length() < 3) {
            char temp = lower.charAt(lower.length() - 1);
            do {
                lower.append(temp);
            } while (lower.length() < 3);
        }

        answer = lower.toString();
        return answer;
    }
}
