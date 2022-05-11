package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _42748Test {
    @Test
    void testCase1() {
        // given
        int array[] = {1, 5, 2, 6, 3, 7, 4};
        int commands[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] compareResult = {5, 6, 3};

        _42748 object = new _42748();

        // when
        int[] result = object.solution(array, commands);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        int array[] = {3, 2, 4, 1, 5, 7, 8, 6, 9};
        int commands[][] = {{1, 4, 2}, {5, 9, 3}, {1, 9, 8}};

        int[] compareResult = {2, 7, 8};

        _42748 object = new _42748();

        // when
        int[] result = object.solution(array, commands);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}