package baekjoon;

import java.io.*;

public class _17478 {
    /*
    * 재귀함수가 뭔가요?
    * https://www.acmicpc.net/problem/17478
    * */
    final String[] msg = {"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n",
            "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n",
            "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n"};
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public void solution () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(reader.readLine());
        reader.close();

        writer.write("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
        chatBot(0,n);
        writer.flush();
    }

    private void chatBot(int iteration, int endValue) throws IOException {
        writer.write("_".repeat(iteration * 4) + "\"재귀함수가 뭔가요?\"\n");

        if (iteration < endValue) {
            for (int i = 0; i < msg.length; i++) {
                writer.write("_".repeat(iteration * 4) + msg[i]);
            }
            chatBot(iteration + 1, endValue);
        }
        else {
            writer.write("_".repeat(iteration * 4) + "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
        }

        writer.write("_".repeat(iteration * 4) + "라고 답변하였지.\n");
    }

}
