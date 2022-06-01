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

class _1152Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _1152 object;

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
    @DisplayName("normal case")
    void testCase1() {
        // given
        setInputStream("The Curious Case of Benjamin Button");

        int compareResult = 6;

        // when
        object = new _1152();
        object.solution();

        int result = Integer.valueOf(output.toString().trim());
        // then
        assertThat(result)
                .isEqualTo(compareResult);
    }
    @Test
    @DisplayName("문자열 첫번째 공백")
    void testCase2() {
        // given
        setInputStream(" The first character is a blank");

        int compareResult = 6;

        // when
        object = new _1152();
        object.solution();

        int result = Integer.valueOf(output.toString().trim());
        // then
        assertThat(result)
                .isEqualTo(compareResult);
    }
    @Test
    @DisplayName("문자열 마지막이 공백")
    void testCase3() {
        // given
        setInputStream("The last character is a blank ");

        int compareResult = 6;

        // when
        object = new _1152();
        object.solution();

        int result = Integer.valueOf(output.toString().trim());
        // then
        assertThat(result)
                .isEqualTo(compareResult);
    }
    @Test
    @DisplayName("문자열 모두 공백")
    void testCase4() {
        // given
        setInputStream("   ");

        int compareResult = 0;

        // when
        object = new _1152();
        object.solution();

        int result = Integer.valueOf(output.toString().trim());
        // then
        assertThat(result)
                .isEqualTo(compareResult);
    }

}