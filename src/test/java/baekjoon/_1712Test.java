package baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.*;

class _1712Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _1712 object;

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
        setInputStream("1000 70 170");

        int compareResult = 11;

        // when
        object = new _1712();
        object.solution();

        // then
        int result = Integer.valueOf(output.toString().trim());
        assertThat(result)
                .isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        setInputStream("3 2 1");

        int compareResult = -1;

        // when
        object = new _1712();
        object.solution();

        // then
        int result = Integer.valueOf(output.toString().trim());
        assertThat(result)
                .isEqualTo(compareResult);
    }

    @Test
    void testCase3() {
        // given
        setInputStream("2100000000 9 10");

        int compareResult = 2100000001;

        // when
        object = new _1712();
        object.solution();

        // then
        int result = Integer.valueOf(output.toString().trim());
        assertThat(result)
                .isEqualTo(compareResult);
    }

}