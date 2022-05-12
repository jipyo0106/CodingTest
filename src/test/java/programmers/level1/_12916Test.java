package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12916Test {
    @Test
    void testCase1() {
        // given
        String s = "pPoooyY";

        boolean compareResult = true;

        _12916 object = new _12916();

        // when
        boolean result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        String s = "Pyy";

        boolean compareResult = false;

        _12916 object = new _12916();

        // when
        boolean result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}