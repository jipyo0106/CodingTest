package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _77484Test {
    @Test
    void testCase1() {
        // given
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        int[] compareResult = {3, 5};

        _77484 object = new _77484();

        // when
        int[] result = object.solution(lottos, win_nums);

        // then
        assertThat(result).isEqualTo(compareResult);

    }

    @Test
    void testCase2() {
        // given
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};

        int[] compareResult = {1, 6};

        _77484 object = new _77484();

        // when
        int[] result = object.solution(lottos, win_nums);

        // then
        assertThat(result).isEqualTo(compareResult);

    }

    @Test
    void testCase3() {
        // given
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};

        int[] compareResult = {1, 1};

        _77484 object = new _77484();

        // when
        int[] result = object.solution(lottos, win_nums);

        // then
        assertThat(result).isEqualTo(compareResult);

    }
}