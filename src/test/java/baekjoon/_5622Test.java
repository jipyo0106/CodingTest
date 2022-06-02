package baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.*;

class _5622Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _5622 object;

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
        setInputStream("WA");

        int compareResult = 13;

        // when
        object = new _5622();
        object.solution();

        int result = Integer.valueOf(output.toString().trim());
        // then
        assertThat(result)
                .isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        setInputStream("UNUCIC");

        int compareResult = 36;

        // when
        object = new _5622();
        object.solution();

        int result = Integer.valueOf(output.toString().trim());
        // then
        assertThat(result)
                .isEqualTo(compareResult);
    }

}