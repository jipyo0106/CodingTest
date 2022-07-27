package baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;

class _11718Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _11718 object;

    @BeforeEach
    void setUpOutputStream() {
        System.setOut(new PrintStream(output));
    }
    @AfterEach
    void resotreOutputStream() {
        System.setOut(System.out);
        output.reset();
    }

    void setInputStream(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    /*
    * 그대로 출력하기 예제
    * */
    @Test
    void testCase1() throws IOException {
        // given
        setInputStream("Hello\n" +
                "Baekjoon\n" +
                "Online Judge");

        String compareResult = "Hello\n" +
                "Baekjoon\n" +
                "Online Judge\n";

        // when
        object = new _11718();
        object.solution();

        // then
        assertThat(output.toString())
                .isEqualTo(compareResult);
    }


    /*
    * 그대로 출력하기2 예제
    * */
    @Test
    void testCase2() throws IOException {
        // given
        setInputStream("    Hello\n" +
                "\n" +
                "Baekjoon     \n" +
                "   Online Judge    ");

        String compareResult = "    Hello\n" +
                "\n" +
                "Baekjoon     \n" +
                "   Online Judge    \n";

        // when
        object = new _11718();
        object.solution();

        // then
        assertThat(output.toString())
                .isEqualTo(compareResult);
    }

}