package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12928Test {
    @Test
    void testCase1() {
        // given
        int n = 12;
        int compareResult = 28;

        _12928 object = new _12928();

        // when
        int result = object.solution(n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        int n = 5;
        int compareResult = 6;

        _12928 object = new _12928();

        // when
        int result = object.solution(n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}