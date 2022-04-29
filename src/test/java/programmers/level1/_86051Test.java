package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _86051Test {

    @Test
    void testCase1() {
        // given
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        // when
        _86051 object = new _86051();
        // then
        assertThat(object.solution(numbers)).isEqualTo(14);
    }

    @Test
    void testCase2() {
        // given
        int[] numbers = {5, 8, 4, 0, 6, 7, 9};
        // when
        _86051 object = new _86051();
        // then
        assertThat(object.solution(numbers)).isEqualTo(6);
    }
}