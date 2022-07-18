package baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;

class _1009Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _1009 object;

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
                "1 6\n" +
                "3 7\n" +
                "6 2\n" +
                "7 100\n" +
                "9 635");

        String compareResult = "1\n" +
                "7\n" +
                "6\n" +
                "1\n" +
                "9";

        // when
        object = new _1009();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

    @Test
    void testCase2() throws IOException {
        // given
        setInputStream("2\n" +
                "11 4\n" +
                "100 5");

        String compareResult = "1\n" +
                "10";

        // when
        object = new _1009();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }


}