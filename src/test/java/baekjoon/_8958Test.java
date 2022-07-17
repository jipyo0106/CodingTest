package baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;

class _8958Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _8958 object;

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
        setInputStream("5\n" +
                "OOXXOXXOOO\n" +
                "OOXXOOXXOO\n" +
                "OXOXOXOXOXOXOX\n" +
                "OOOOOOOOOO\n" +
                "OOOOXOOOOXOOOOX");

        String compareResult = "10\n" +
                "9\n" +
                "7\n" +
                "55\n" +
                "30";

        // when
        object = new _8958();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

    @Test
    void testCase2() throws IOException {
        // given
        setInputStream("3\n" +
                "OOOXXXOXO\n" +
                "OOOOOOOOO\n" +
                "OOOXXXOOOXXXOOO");

        String compareResult = "8\n" +
                "45\n" +
                "18";

        // when
        object = new _8958();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }
}