package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12954Test {
    @Test
    void testCase1() {
        // given
        int x = 2;
        int n = 5;

        long[] compareResult = {2, 4, 6, 8, 10};

        _12954 object = new _12954();

        // when
        long[] result = object.solution(x, n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void testCase2() {
        // given
        int x = 4;
        int n = 3;

        long[] compareResult = {4, 8, 12};

        _12954 object = new _12954();

        // when
        long[] result = object.solution(x, n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void testCase3() {
        // given
        int x = -4;
        int n = 2;

        long[] compareResult = {-4, -8};

        _12954 object = new _12954();

        // when
        long[] result = object.solution(x, n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}