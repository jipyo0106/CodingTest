package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12906Test {
    @Test
    void testCase1() {
        // given
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        int[] compareResult = {1, 3, 0, 1};

        _12906 object = new _12906();

        // when
        int[] result = object.solution(arr);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void testCase2() {
        // given
        int[] arr = {4, 4, 4, 3, 3};

        int[] compareResult = {4, 3};

        _12906 object = new _12906();

        // when
        int[] result = object.solution(arr);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}