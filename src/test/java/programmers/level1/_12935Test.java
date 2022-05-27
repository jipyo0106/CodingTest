package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12935Test {
    @Test
    void testCase1() {
        // given
        int[] arr = {4, 3, 2, 1};


        int[] compareResult = {4, 3, 2};

        _12935 object = new _12935();

        // when
        int[] result = object.solution(arr);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void testCase2() {
        // given
        int[] arr = {10};


        int[] compareResult = {-1};

        _12935 object = new _12935();

        // when
        int[] result = object.solution(arr);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}