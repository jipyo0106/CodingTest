package baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.*;

class _1316Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _1316 object;

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
                "3\n" +
                "happy\n" +
                "new\n" +
                "year");

        int compareResult = 3;

        // when
        object = new _1316();
        object.solution();

        // then
        int result = Integer.valueOf(output.toString().trim());
        assertThat(result)
                .isEqualTo(compareResult);
    }
    @Test
    void testCase2() {
        // given
        setInputStream(
                "4\n" +
                "aba\n" +
                "abab\n" +
                "abcabc\n" +
                "a");

        int compareResult = 1;

        // when
        object = new _1316();
        object.solution();

        // then
        int result = Integer.valueOf(output.toString().trim());
        assertThat(result)
                .isEqualTo(compareResult);
    }
    @Test
    void testCase3() {
        // given
        setInputStream(
                "5\n" +
                "ab\n" +
                "aa\n" +
                "aca\n" +
                "ba\n" +
                "bb");

        int compareResult = 4;

        // when
        object = new _1316();
        object.solution();

        // then
        int result = Integer.valueOf(output.toString().trim());
        assertThat(result)
                .isEqualTo(compareResult);
    }

    @Test
    void testCase4() {
        // given
        setInputStream(
                "2\n" +
                "yzyzy\n" +
                "zyzyz");

        int compareResult = 0;

        // when
        object = new _1316();
        object.solution();

        // then
        int result = Integer.valueOf(output.toString().trim());
        assertThat(result)
                .isEqualTo(compareResult);
    }

    @Test
    void testCase5() {
        // given
        setInputStream(
                "1\n" +
                "z");

        int compareResult = 1;

        // when
        object = new _1316();
        object.solution();

        // then
        int result = Integer.valueOf(output.toString().trim());
        assertThat(result)
                .isEqualTo(compareResult);
    }
}