package programmers.level1;

public class _17681 {
    /*
     * [1차 비밀지도]
     * https://programmers.co.kr/learn/courses/30/lessons/17681
     * */
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder answerBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String _1 = String.format("%" + n + "s", Integer.toBinaryString(arr1[i]))
                    .replace(' ', '0');
            String _2 = String.format("%" + n + "s", Integer.toBinaryString(arr2[i]))
                    .replace(' ', '0');


            for (int j = 0; j < n; j++) {
                if (_1.charAt(j) == '0' && _2.charAt(j) == '0') {
                    answerBuilder.append(' ');
                    continue;
                }
                answerBuilder.append('#');
            }
            answer[i] = answerBuilder.toString();
            answerBuilder.delete(0, answerBuilder.length());
        }
        return answer;
    }

    /*
     * 풀이 중 제일 괜찮아보였던 코드
     * */
    public String[] solution2(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }

        return result;
    }
}
