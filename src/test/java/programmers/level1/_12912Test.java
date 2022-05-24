package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12912Test {
    @Test
    void testCase1() {
        // given
        int a = 3;
        int b = 5;

        long compareResult = 12;

        _12912 object = new _12912();

        // when
        long result = object.solution(a, b);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        int a = 3;
        int b = 3;

        long compareResult = 3;

        _12912 object = new _12912();

        // when
        long result = object.solution(a, b);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase3() {
        // given
        int a = 5;
        int b = 3;

        long compareResult = 12;

        _12912 object = new _12912();

        // when
        long result = object.solution(a, b);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}