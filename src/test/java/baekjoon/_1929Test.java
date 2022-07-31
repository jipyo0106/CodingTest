package baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;

class _1929Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _1929 object;

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
        setInputStream("3 16");

        String compareResult = "3\n" +
                "5\n" +
                "7\n" +
                "11\n" +
                "13";

        // when
        object = new _1929();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }


    @Test
    void testCase2() throws IOException {
        // given
        setInputStream("1 2");

        String compareResult = "2";

        // when
        object = new _1929();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

}