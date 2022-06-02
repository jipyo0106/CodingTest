package baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.*;

class _2941Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _2941 object;

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
        setInputStream("ljes=njak");

        int compareResult = 6;

        // when
        object = new _2941();
        object.solution();

        int result = Integer.valueOf(output.toString().trim());
        // then
        assertThat(result)
                .isEqualTo(compareResult);
    }
    @Test
    void testCase2() {
        // given
        setInputStream("ddz=z=");

        int compareResult = 3;

        // when
        object = new _2941();
        object.solution();

        int result = Integer.valueOf(output.toString().trim());
        // then
        assertThat(result)
                .isEqualTo(compareResult);
    }
    @Test
    void testCase3() {
        // given
        setInputStream("nljj");

        int compareResult = 3;

        // when
        object = new _2941();
        object.solution();

        int result = Integer.valueOf(output.toString().trim());
        // then
        assertThat(result)
                .isEqualTo(compareResult);
    }
    @Test
    void testCase4() {
        // given
        setInputStream("c=c=");

        int compareResult = 2;

        // when
        object = new _2941();
        object.solution();

        int result = Integer.valueOf(output.toString().trim());
        // then
        assertThat(result)
                .isEqualTo(compareResult);
    }
    @Test
    void testCase5() {
        // given
        setInputStream("dz=ak");

        int compareResult = 3;

        // when
        object = new _2941();
        object.solution();

        int result = Integer.valueOf(output.toString().trim());
        // then
        assertThat(result)
                .isEqualTo(compareResult);
    }

}