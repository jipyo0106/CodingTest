package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12944Test {
    @Test
    void testCase1() {
        // given
        int[] arr = {1, 2, 3, 4};

        double compareResult = 2.5;

        _12944 object = new _12944();

        // when
        double result = object.solution(arr);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        int[] arr = {5, 5};

        double compareResult = 5;

        _12944 object = new _12944();

        // when
        double result = object.solution(arr);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}