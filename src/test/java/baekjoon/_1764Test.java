package baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;

class _1764Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _1764 object;

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
        setInputStream("3 4\n" +
                "ohhenrie\n" +
                "charlie\n" +
                "baesangwook\n" +
                "obama\n" +
                "baesangwook\n" +
                "ohhenrie\n" +
                "clinton");

        String compareResult = "2\n" +
                "baesangwook\n" +
                "ohhenrie";

        // when
        object = new _1764();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }
}