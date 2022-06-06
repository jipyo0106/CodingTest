package baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.*;

class _2292Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _2292 object;

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
    @DisplayName("입력값 : 13")
    void testCase1() {
        // given
        setInputStream("13");

        int compareResult = 3;

        // when
        object = new _2292();
        object.solution();

        // then
        int result = Integer.valueOf(output.toString().trim());
        assertThat(result)
                .isEqualTo(compareResult);
    }

    @Test
    @DisplayName("입력값 : 58")
    void testCase2() {
        // given
        setInputStream("58");

        int compareResult = 5;

        // when
        object = new _2292();
        object.solution();

        // then
        int result = Integer.valueOf(output.toString().trim());
        assertThat(result)
                .isEqualTo(compareResult);
    }

    @Test
    @DisplayName("입력값 : 72")
    void testCase3() {
        // given
        setInputStream("72");

        int compareResult = 6;

        // when
        object = new _2292();
        object.solution();

        // then
        int result = Integer.valueOf(output.toString().trim());
        assertThat(result)
                .isEqualTo(compareResult);
    }

    @Test
    @DisplayName("입력값 : 1")
    void testCase4() {
        // given
        setInputStream("1");

        int compareResult = 1;

        // when
        object = new _2292();
        object.solution();

        // then
        int result = Integer.valueOf(output.toString().trim());
        assertThat(result)
                .isEqualTo(compareResult);
    }

}