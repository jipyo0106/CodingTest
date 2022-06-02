package baekjoon;

import java.util.Scanner;

public class _2941 {
    /*
    * 크로아티아 알파벳
    * https://www.acmicpc.net/problem/2941
    * */
    public void solution() {
        Scanner sc = new Scanner(System.in);

        String[] tempalte = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int alphaCount = 0;
        StringBuilder s = new StringBuilder(sc.nextLine());

        for (int i = 0; i < tempalte.length; i++) {
            int len = s.length(),
                idx = s.indexOf(tempalte[i]);

            while (idx != -1){
                s.replace(idx, idx + tempalte[i].length(), "+");
                alphaCount += (len - s.length()) / tempalte[i].length();
                idx = s.indexOf(tempalte[i]);
            }
        }
        alphaCount = alphaCount + (s.length() - alphaCount);

        System.out.println(alphaCount);
    }
}
