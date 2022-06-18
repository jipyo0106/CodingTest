package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class _26Test {
    @Test
    @DisplayName("case 1 : 리턴값 체크")
    void testCase1_return_value() {
        // given
        int[] nums = {1, 1, 2};

        int compareResult = 2;

        _26 object = new _26();

        // when
        int result = object.solution(nums);

        // then
        Assertions.assertEquals(compareResult, result);
    }

    @Test
    @DisplayName("case 1 : nums 체크")
    void testCase1_nums() {
        // given
        int[] nums = {1, 1, 2};

        int[] compareResult = {1, 2};

        _26 object = new _26();

        // when
        object.solution(nums);

        // then
        for (int i = 0; i < compareResult.length; i++) {
            Assertions.assertEquals(compareResult[i], nums[i]);
        }
    }

    @Test
    @DisplayName("case 2 : 리턴값 체크")
    void testCase2_return_value() {
        // given
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int compareResult = 5;

        _26 object = new _26();

        // when
        int result = object.solution(nums);

        // then
        Assertions.assertEquals(compareResult, result);
    }

    @Test
    @DisplayName("case 2 : nums 체크")
    void testCase2_nums() {
        // given
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int[] compareResult = {0, 1, 2, 3, 4};

        _26 object = new _26();

        // when
        object.solution(nums);

        // then
        for (int i = 0; i < compareResult.length; i++) {
            Assertions.assertEquals(compareResult[i], nums[i]);
        }
    }

}