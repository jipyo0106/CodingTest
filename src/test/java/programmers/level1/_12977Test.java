package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12977Test {
    @Test
    void testCase1() {
        // given
        int[] nums = {1, 2, 3, 4};
        int compareResult = 1;

        _12977 object = new _12977();

        // when
        int result = object.solution(nums);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        int[] nums = {1, 2, 7, 6, 4};
        int compareResult = 4;

        _12977 object = new _12977();

        // when
        int result = object.solution(nums);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}