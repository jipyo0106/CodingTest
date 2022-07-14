package programmers.level2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _42584Test {
    @Test
    void testCase1() {
        // given
        int[] prices = {1, 2, 3, 2, 3};
        int[] compareResult = {4, 3, 1, 1, 0};

        _42584 object = new _42584();

        // when
        int[] result = object.solution(prices);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

}