package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12982Test {
    @Test
    void testCase1() {
        // given
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;

        int compareResult = 3;

        _12982 object = new _12982();

        // when
        int result = object.solution(d, budget);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        int[] d = {2, 2, 3, 3};
        int budget = 10;

        int compareResult = 4;

        _12982 object = new _12982();

        // when
        int result = object.solution(d, budget);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}