package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12901Test {
    @Test
    void testCase1() {
        // given
        int a = 5;
        int b = 24;

        String compareResult = "TUE";

        _12901 object = new _12901();

        // when
        String result = object.solution(a, b);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        int a = 1;
        int b = 1;

        String compareResult = "FRI";

        _12901 object = new _12901();

        // when
        String result = object.solution(a, b);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase3() {
        // given
        int a = 2;
        int b = 29;

        String compareResult = "MON";

        _12901 object = new _12901();

        // when
        String result = object.solution(a, b);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

}