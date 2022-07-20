package baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;

class _11721Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _11721 object;

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
        setInputStream("BaekjoonOnlineJudge");

        String compareResult = "BaekjoonOn\n" +
                "lineJudge";

        // when
        object = new _11721();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

    @Test
    void testCase2() throws IOException {
        // given
        setInputStream("OneTwoThreeFourFiveSixSevenEightNineTen");

        String compareResult = "OneTwoThre\n" +
                "eFourFiveS\n" +
                "ixSevenEig\n" +
                "htNineTen";

        // when
        object = new _11721();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

    @Test
    void testCase3() throws IOException {
        // given
        setInputStream("0123456789");

        String compareResult = "0123456789";

        // when
        object = new _11721();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }
}