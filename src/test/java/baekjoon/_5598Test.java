package baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;

class _5598Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _5598 object;

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
        setInputStream("MRL");

        String compareResult = "JOI";

        // when
        object = new _5598();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }
    @Test
    void testCase2() throws IOException {
        // given
        setInputStream("FURDWLD");

        String compareResult = "CROATIA";

        // when
        object = new _5598();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }
    @Test
    void testCase3() throws IOException {
        // given
        setInputStream("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

        String compareResult = "XYZABCDEFGHIJKLMNOPQRSTUVW";

        // when
        object = new _5598();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

}