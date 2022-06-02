package baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.*;

class _2908Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _2908 object;

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
        setInputStream("734 893");

        int compareResult = 437;

        // when
        object = new _2908();
        object.solution();

        int result = Integer.valueOf(output.toString().trim());
        // then
        assertThat(result)
                .isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        setInputStream("221 231");

        int compareResult = 132;

        // when
        object = new _2908();
        object.solution();

        int result = Integer.valueOf(output.toString().trim());
        // then
        assertThat(result)
                .isEqualTo(compareResult);
    }
    @Test
    void testCase3() {
        // given
        setInputStream("839 237");

        int compareResult = 938;

        // when
        object = new _2908();
        object.solution();

        int result = Integer.valueOf(output.toString().trim());
        // then
        assertThat(result)
                .isEqualTo(compareResult);
    }

}