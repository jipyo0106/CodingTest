package baekjoon;

import java.io.*;

public class _9498 {
    /*
    * 시험성적
    * https://www.acmicpc.net/problem/9498
    * */
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int score = Integer.valueOf(reader.readLine());
        char printScore = 0;
        switch (score / 10) {
            case 10:
            case 9:
                printScore = 'A';
                break;
            case 8:
                printScore = 'B';
                break;
            case 7:
                printScore = 'C';
                break;
            case 6:
                printScore = 'D';
                break;
            default :
                printScore = 'F';
        }
        writer.write(printScore);
        writer.flush();

        writer.close();
        reader.close();
    }
}
