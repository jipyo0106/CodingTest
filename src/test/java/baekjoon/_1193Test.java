package baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.*;

class _1193Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _1193 object;

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
    @DisplayName("입력값 : 1")
    void testCase1() throws IOException {
        // given
        setInputStream("1");

        String compareResult = "1/1";

        // when
        object = new _1193();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

    @Test
    @DisplayName("입력값 : 2")
    void testCase2() throws IOException{
        // given
        setInputStream("2");

        String compareResult = "1/2";

        // when
        object = new _1193();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

    @Test
    @DisplayName("입력값 : 3")
    void testCase3() throws IOException {
        // given
        setInputStream("3");

        String compareResult = "2/1";

        // when
        object = new _1193();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

    @Test
    @DisplayName("입력값 : 4")
    void testCase4() throws IOException {
        // given
        setInputStream("4");

        String compareResult = "3/1";

        // when
        object = new _1193();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

    @Test
    @DisplayName("입력값 : 5")
    void testCase5() throws IOException {
        // given
        setInputStream("5");

        String compareResult = "2/2";

        // when
        object = new _1193();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

    @Test
    @DisplayName("입력값 : 6")
    void testCase6() throws IOException {
        // given
        setInputStream("6");

        String compareResult = "1/3";

        // when
        object = new _1193();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

    @Test
    @DisplayName("입력값 : 7")
    void testCase7() throws IOException {
        // given
        setInputStream("7");

        String compareResult = "1/4";

        // when
        object = new _1193();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

    @Test
    @DisplayName("입력값 : 8")
    void testCase8() throws IOException {
        // given
        setInputStream("8");

        String compareResult = "2/3";

        // when
        object = new _1193();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

    @Test
    @DisplayName("입력값 : 9")
    void testCase9() throws IOException {
        // given
        setInputStream("9");

        String compareResult = "3/2";

        // when
        object = new _1193();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

    @Test
    @DisplayName("입력값 : 14")
    void testCase10() throws IOException {
        // given
        setInputStream("14");

        String compareResult = "2/4";

        // when
        object = new _1193();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }
}