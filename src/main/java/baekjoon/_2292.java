package baekjoon;

import java.util.Scanner;

public class _2292 {
    /*
    * 벌집
    * https://www.acmicpc.net/problem/2292
    * */
    public void solution() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sectorValue = 1,
            sectorIncrease = 0,
            iter = 1;
        for (; sectorValue < num; iter++) {
            sectorIncrease += 6;
            sectorValue += sectorIncrease;
        }
        System.out.println(iter);
    }
}
