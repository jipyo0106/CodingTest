package baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.*;

class _2675Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _2675 object;

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
    void testCase1() {
        // given
        setInputStream(
                "2\n" +
                "3 ABC\n" +
                "5 /HTP");

        String compareResult =
                "AAABBBCCC\r\n" +
                "/////HHHHHTTTTTPPPPP";

        // when
        object = new _2675();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        setInputStream(
                "3\n" +
                "2 ZZ\n" +
                "1 0POST\n" +
                "2 \\$%*+-./:");

        String compareResult =
                "ZZZZ\r\n" +
                "0POST\r\n" +
                "\\\\$$%%**++--..//::";

        // when
        object = new _2675();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

    @Test
    void testCase3() {
        // given
        setInputStream(
                "2\n" +
                "2 ZZ\n" +
                "1 abcd");

        String compareResult =
                "ZZZZ\r\n" +
                "abcd";

        // when
        object = new _2675();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }
    @Test
    void testCase4() {
        // given
        setInputStream(
                "1 \n" +
                "2 abcd\n");

        String compareResult =
                "aabbccdd";

        // when
        object = new _2675();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }
}