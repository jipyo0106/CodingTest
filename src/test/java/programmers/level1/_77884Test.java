package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _77884Test {
    @Test
    void testCase1() {
        // given
        int left = 13,
                right = 17;
        int compareResult = 43;
        _77884 object = new _77884();

        // when
        int result = object.solution(left, right);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        int left = 24,
                right = 27;
        int compareResult = 52;
        _77884 object = new _77884();

        // when
        int result = object.solution(left, right);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}