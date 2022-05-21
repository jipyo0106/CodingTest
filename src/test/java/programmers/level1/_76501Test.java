package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _76501Test {
    @Test
    void testCase1() {
        // given
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};

        int compareResult = 9;

        _76501 object = new _76501();

        // when
        int result = object.solution(absolutes, signs);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        int[] absolutes = {1, 2, 3};
        boolean[] signs = {false, false, true};

        int compareResult = 0;

        _76501 object = new _76501();

        // when
        int result = object.solution(absolutes, signs);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}