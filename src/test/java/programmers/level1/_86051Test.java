package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _86051Test {

    @Test
    void testCase1() {
        // given
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        int compareResult = 14;

        _86051 object = new _86051();

        // when
        int result = object.solution(numbers);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        int[] numbers = {5, 8, 4, 0, 6, 7, 9};
        int compareResult = 6;

        _86051 object = new _86051();

        // when
        int result = object.solution(numbers);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}