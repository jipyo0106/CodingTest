package baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;

class _1920Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _1920 object;

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
        setInputStream("5\n" +
                "4 1 5 2 3\n" +
                "5\n" +
                "1 3 7 9 5");

        String compareResult = "1\n" +
                "1\n" +
                "0\n" +
                "0\n" +
                "1";

        // when
        object = new _1920();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

}