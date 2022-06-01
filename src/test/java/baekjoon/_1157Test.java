package baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.*;

class _1157Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _1157 object;

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
        setInputStream("Mississipi");

        String compareResult = "?";

        // when
        object = new _1157();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }
    @Test
    void testCase2() {
        // given
        setInputStream("zZa");

        String compareResult = "Z";

        // when
        object = new _1157();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }
    @Test
    void testCase3() {
        // given
        setInputStream("z");

        String compareResult = "Z";

        // when
        object = new _1157();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }
    @Test
    void testCas4() {
        // given
        setInputStream("baaa");

        String compareResult = "A";

        // when
        object = new _1157();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }


}