package baekjoon;

import java.util.Scanner;

public class _5622 {
    /*
    * 다이얼
    * https://www.acmicpc.net/problem/5622
    * */
    public void solution() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int total_second = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'A':
                case 'B':
                case 'C':
                    total_second += 3;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    total_second += 4;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    total_second += 5;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    total_second += 6;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    total_second += 7;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    total_second += 8;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    total_second += 9;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    total_second += 10;
                    break;
            }
        }
        System.out.println(total_second);
    }
}
