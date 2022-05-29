package programmers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _42840Test {
    @Test
    void testCase1() {
        // given
        int[] arr = {1, 2, 3, 4, 5};

        int[] compareResult = {1};

        _42840 object = new _42840();

        // when
        int[] result = object.solution(arr);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void testCase2() {
        // given
        int[] arr = {1, 3, 2, 4, 2};

        int[] compareResult = {1, 2, 3};

        _42840 object = new _42840();

        // when
        int[] result = object.solution(arr);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    @DisplayName("수포자 모두 맞추지 못했을 때")
    void testCase3() {
        // given
        int[] arr = {4, 4, 4};

        int[] compareResult = {1, 2, 3};

        _42840 object = new _42840();

        // when
        int[] result = object.solution(arr);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}