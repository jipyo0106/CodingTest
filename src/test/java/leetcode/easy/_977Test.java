package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _977Test {
    @Test
    @DisplayName("입력값 : 음수, 0, 양수 값")
    void solution1_testCase1() {
        // given
        int[] nums = {-4, -1, 0, 3, 10};

        int[] compareResult = {0, 1, 9, 16, 100};

        _977 object = new _977();

        // when
        int[] result = object.solution(nums);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void solution1_testCase2() {
        // given
        int[] nums = {-7, -3, 2, 3, 11};

        int[] compareResult = {4, 9, 9, 49, 121};

        _977 object = new _977();

        // when
        int[] result = object.solution(nums);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    @DisplayName("입력값 : 음수, 0, 양수 값")
    void solution2_testCase1() {
        // given
        int[] nums = {-4, -1, 0, 3, 10};

        int[] compareResult = {0, 1, 9, 16, 100};

        _977 object = new _977();

        // when
        int[] result = object.solution2(nums);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void solution2_testCase2() {
        // given
        int[] nums = {-7, -3, 2, 3, 11};

        int[] compareResult = {4, 9, 9, 49, 121};

        _977 object = new _977();

        // when
        int[] result = object.solution2(nums);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}