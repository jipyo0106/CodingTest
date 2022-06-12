package baekjoon;

import java.io.*;
import java.util.ArrayList;

public class _10828 {
    /*
    * 스택
    * https://www.acmicpc.net/problem/10828
    * */
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.valueOf(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String order = reader.readLine();
            if (order.equals("pop")) {
                int pop = (list.size() == 0) ? -1 : list.remove(list.size() - 1);
                writer.write(pop + "\n");
            }
            else if (order.equals("size")) {
                writer.write(list.size() + "\n");
            }
            else if (order.equals("top")) {
                int top = (list.size() == 0) ? -1 : list.get(list.size() - 1);
                writer.write(top + "\n");
            }
            else if (order.equals("empty")) {
                int isEmpty = (list.size() == 0) ? 1 : 0;
                writer.write(isEmpty  + "\n");
            }
            else {
                // push
                String[] sArr = order.split(" ");
                list.add(Integer.valueOf(sArr[1]));
            }
            writer.flush();
        }

        reader.close();
        writer.close();
    }
}
