package baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;

class _1100Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _1100 object;

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
        setInputStream(".F.F...F\n" +
                "F...F.F.\n" +
                "...F.F.F\n" +
                "F.F...F.\n" +
                ".F...F..\n" +
                "F...F.F.\n" +
                ".F.F.F.F\n" +
                "..FF..F.");

        String compareResult = "1";

        // when
        object = new _1100();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

    @Test
    void testCase2() throws IOException {
        // given
        setInputStream("........\n" +
                "........\n" +
                "........\n" +
                "........\n" +
                "........\n" +
                "........\n" +
                "........\n" +
                "........");

        String compareResult = "0";

        // when
        object = new _1100();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

    @Test
    void testCase3() throws IOException {
        // given
        setInputStream("FFFFFFFF\n" +
                "FFFFFFFF\n" +
                "FFFFFFFF\n" +
                "FFFFFFFF\n" +
                "FFFFFFFF\n" +
                "FFFFFFFF\n" +
                "FFFFFFFF\n" +
                "FFFFFFFF");

        String compareResult = "32";

        // when
        object = new _1100();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

    @Test
    void testCase4() throws IOException {
        // given
        setInputStream("........\n" +
                "..F.....\n" +
                ".....F..\n" +
                ".....F..\n" +
                "........\n" +
                "........\n" +
                ".......F\n" +
                ".F......");

        String compareResult = "2";

        // when
        object = new _1100();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

}