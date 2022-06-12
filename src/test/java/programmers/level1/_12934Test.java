package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12934Test {
    @Test
    void testCase1() {
        // given
        long n = 121;

        long compareResult = 144;

        _12934 object = new _12934();

        // when
        long result = object.solution(n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        long n = 3;

        long compareResult = -1;

        _12934 object = new _12934();

        // when
        long result = object.solution(n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}