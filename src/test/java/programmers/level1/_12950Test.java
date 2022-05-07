package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12950Test {
    @Test
    void testCase1() {
        // given
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};

        int[][] compareResult = {{4, 6}, {7, 9}};
        _12950 object = new _12950();

        // when
        int[][] result = object.solution(arr1, arr2);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void testCase2() {
        // given
        int[][] arr1 = {{1, 2}};
        int[][] arr2 = {{3, 4}};

        int[][] compareResult = {{4, 6}};
        _12950 object = new _12950();

        // when
        int[][] result = object.solution(arr1, arr2);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}