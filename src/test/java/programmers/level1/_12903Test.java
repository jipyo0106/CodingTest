package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12903Test {
    @Test
    void testCase1() {
        // given
        String s = "abcde";

        String compareResult = "c";

        _12903 object = new _12903();

        // when
        String result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        String s = "qwer";

        String compareResult = "we";

        _12903 object = new _12903();

        // when
        String result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}