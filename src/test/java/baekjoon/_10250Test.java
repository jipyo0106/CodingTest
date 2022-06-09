package baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.*;

class _10250Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _10250 object;

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
        setInputStream(
                "2\n" +
                "6 12 10\n" +
                "30 50 72");

        String compareResult =
                "402\n" +
                "1203";

        // when
        object = new _10250();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }
    @Test
    @DisplayName("n과 h가 같은 경우")
    void testCase2() throws IOException {
        // given
        setInputStream(
                "1\n" +
                "6 12 12");

        String compareResult =
                "602";

        // when
        object = new _10250();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

}