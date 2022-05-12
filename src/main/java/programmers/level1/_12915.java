package programmers.level1;

public class _12915 {
    /*
    * 문자열 내 마음대로 정렬하기
    * https://programmers.co.kr/learn/courses/30/lessons/12915
    * */
    public String[] solution(String[] strings, int n) {
        String[] answer = strings.clone();

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length - i - 1; j++) {
                if (answer[j].charAt(n) > answer[j + 1].charAt(n)) {
                    String temp = answer[j + 1];
                    answer[j + 1] = answer[j];
                    answer[j] = temp;
                }
                else if (answer[j].charAt(n) == answer[j + 1].charAt(n)) {
                    if (answer[j].compareTo(answer[j + 1]) > 0){
                        String temp = answer[j + 1];
                        answer[j + 1] = answer[j];
                        answer[j] = temp;
                    }
                }
            }
        }

        return answer;
    }
}
