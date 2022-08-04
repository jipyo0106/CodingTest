package baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;

class _1181Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _1181 object;

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
        setInputStream("13\n" +
                "but\n" +
                "i\n" +
                "wont\n" +
                "hesitate\n" +
                "no\n" +
                "more\n" +
                "no\n" +
                "more\n" +
                "it\n" +
                "cannot\n" +
                "wait\n" +
                "im\n" +
                "yours");

        String compareResult = "i\n" +
                "im\n" +
                "it\n" +
                "no\n" +
                "but\n" +
                "more\n" +
                "wait\n" +
                "wont\n" +
                "yours\n" +
                "cannot\n" +
                "hesitate";

        // when
        object = new _1181();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

}