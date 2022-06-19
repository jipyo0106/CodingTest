package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _88Test {
    @Test
    void testCase1() {
        // given
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        int[] compareResult = {1, 2, 2, 3, 5, 6};

        _88 object = new _88();

        // when
        object.solution(nums1, m, nums2, n);

        // then
        assertThat(nums1).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 ={};
        int n = 0;

        int[] compareResult = {1};

        _88 object = new _88();

        // when
        object.solution(nums1, m, nums2, n);

        // then
        assertThat(nums1).isEqualTo(compareResult);
    }

    @Test
    void testCase3() {
        // given
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 ={1};
        int n = 1;

        int[] compareResult = {1};

        _88 object = new _88();

        // when
        object.solution(nums1, m, nums2, n);

        // then
        assertThat(nums1).isEqualTo(compareResult);
    }
}