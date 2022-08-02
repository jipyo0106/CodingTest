package baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;

class _10773Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _10773 object;

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
        setInputStream("4\n" +
                "3\n" +
                "0\n" +
                "4\n" +
                "0");

        String compareResult = "0";

        // when
        object = new _10773();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

    @Test
    void testCase2() throws IOException {
        // given
        setInputStream("10\n" +
                "1\n" +
                "3\n" +
                "5\n" +
                "4\n" +
                "0\n" +
                "0\n" +
                "7\n" +
                "0\n" +
                "0\n" +
                "6");

        String compareResult = "7";

        // when
        object = new _10773();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }
}