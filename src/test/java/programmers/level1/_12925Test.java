package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12925Test {
    @Test
    void testCase1() {
        // given
        String s = "1234";

        int compareResult = 1234;

        _12925 object = new _12925();

        // when
        int result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        String s = "-1234";

        int compareResult = -1234;

        _12925 object = new _12925();

        // when
        int result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}