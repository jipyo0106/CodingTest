package baekjoon;

import java.util.HashSet;
import java.util.Scanner;

public class _1316 {
    /*
    * 그룹 단어 체커
    * https://www.acmicpc.net/problem/1316
    * */
    
    // hashset 사용
    public void solution() {
        Scanner sc = new Scanner(System.in);

        int inputCount = 0,
            count = 0;

        count = inputCount = sc.nextInt();

        String[] string = new String[inputCount];
        sc.nextLine();

        for (int i = 0; i < inputCount; i++) {
            string[i] = sc.nextLine();
        }

        HashSet<Character> hash = new HashSet<>();

        for (String str : string) {
            hash.add(str.charAt(0));
            for (int i = 1; i < str.length(); i++) {
                if (hash.contains(str.charAt(i))) {
                    if (str.charAt(i - 1) != str.charAt(i)) {
                        count--;
                        break;
                    }
                }
                else {
                    hash.add(str.charAt(i));
                }
            }
            hash.clear();
        }
        System.out.println(count);
    }

    // array 사용
    public void solution2() {
        Scanner sc = new Scanner(System.in);

        int inputCount = 0,
                count = 0;

        count = inputCount = sc.nextInt();
        sc.nextLine();
        String[] string = new String[inputCount];
        boolean[] alpha = new boolean[26];

        for (int i = 0; i < inputCount; i++) {
            string[i] = sc.nextLine();
        }
        for (String str : string) {
            alpha[str.charAt(0) - 'a'] = true;

            for (int j = 1; j < str.length(); j++) {
                if (alpha[str.charAt(j) - 'a']) {
                    if (str.charAt(j - 1) != str.charAt(j)) {
                        count--;
                        break;
                    }
                }
                else {
                    alpha[str.charAt(j) - 'a'] = true;
                }
            }
            alpha = new boolean[26];
        }
        System.out.println(count);
    }
}
