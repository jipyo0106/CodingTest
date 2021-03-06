package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _1Test {
    @Test
    void solution1_testcase1() {
        // given
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] compareResult = {0, 1};

        _1 object = new _1();

        // when
        int[] result = object.solution(nums, target);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void solution1_testcase2() {
        // given
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] compareResult = {1, 2};

        _1 object = new _1();

        // when
        int[] result = object.solution(nums, target);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void solution1_testcase3() {
        // given
        int[] nums = {3, 3};
        int target = 6;

        int[] compareResult = {0, 1};

        _1 object = new _1();

        // when
        int[] result = object.solution(nums, target);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void solution2_testcase1() {
        // given
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] compareResult = {0, 1};

        _1 object = new _1();

        // when
        int[] result = object.solution2(nums, target);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void solution2_testcase2() {
        // given
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] compareResult = {1, 2};

        _1 object = new _1();

        // when
        int[] result = object.solution2(nums, target);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void solution2_testcase3() {
        // given
        int[] nums = {3, 3};
        int target = 6;

        int[] compareResult = {0, 1};

        _1 object = new _1();

        // when
        int[] result = object.solution2(nums, target);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}