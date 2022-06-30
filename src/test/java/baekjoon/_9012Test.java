package baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;

class _9012Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _9012 object;

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

    @Test
    void testCase1() throws IOException {
        // given
        setInputStream("6\n" +
                "(())())\n" +
                "(((()())()\n" +
                "(()())((()))\n" +
                "((()()(()))(((())))()\n" +
                "()()()()(()()())()\n" +
                "(()((())()(");

        String compareResult = "NO\n" +
                "NO\n" +
                "YES\n" +
                "NO\n" +
                "YES\n" +
                "NO";

        // when
        object = new _9012();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

    @Test
    void testCase2() throws IOException {
        // given
        setInputStream("3\n" +
                "((\n" +
                "))\n" +
                "())(()");

        String compareResult = "NO\n" +
                "NO\n" +
                "NO";

        // when
        object = new _9012();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

}