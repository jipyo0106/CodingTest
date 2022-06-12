package baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.*;

class _10828Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _10828 object;

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
        setInputStream(
                "14\n" +
                "push 1\n" +
                "push 2\n" +
                "top\n" +
                "size\n" +
                "empty\n" +
                "pop\n" +
                "pop\n" +
                "pop\n" +
                "size\n" +
                "empty\n" +
                "pop\n" +
                "push 3\n" +
                "empty\n" +
                "top");

        String compareResult =
                "2\n" +
                "2\n" +
                "0\n" +
                "2\n" +
                "1\n" +
                "-1\n" +
                "0\n" +
                "1\n" +
                "-1\n" +
                "0\n" +
                "3";

        // when
        object = new _10828();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

    @Test
    void testCase2() throws IOException {
        // given
        setInputStream(
                "7\n" +
                "pop\n" +
                "top\n" +
                "push 123\n" +
                "top\n" +
                "pop\n" +
                "top\n" +
                "pop");

        String compareResult =
                "-1\n" +
                "-1\n" +
                "123\n" +
                "123\n" +
                "-1\n" +
                "-1";

        // when
        object = new _10828();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

}