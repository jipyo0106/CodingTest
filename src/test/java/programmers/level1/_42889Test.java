package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _42889Test {
    @Test
    void testCase1() {
        // given
        int n = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};


        int[] compareResult = {3, 4, 2, 1, 5};

        _42889 object = new _42889();

        // when
        int[] result = object.solution(n, stages);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void testCase2() {
        // given
        int n = 4;
        int[] stages = {4, 4, 4, 4, 4};


        int[] compareResult = {4, 1, 2, 3};

        _42889 object = new _42889();

        // when
        int[] result = object.solution(n, stages);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}