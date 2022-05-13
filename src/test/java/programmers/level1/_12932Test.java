package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12932Test {
    @Test
    void testCase1() {
        // given
        long n = 12345L;

        int[] compareResult = {5, 4, 3, 2, 1};

        _12932 object = new _12932();

        // when
        int[] result = object.solution(n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

}