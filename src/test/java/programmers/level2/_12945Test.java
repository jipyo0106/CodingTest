package programmers.level2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12945Test {
    @Test
    void testCase1() {
        // given
        int n = 3;

        int compareResult = 2;

        _12945 object = new _12945();

        // when
        int result = object.solution(n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        int n = 5;

        int compareResult = 5;

        _12945 object = new _12945();

        // when
        int result = object.solution(n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase3() {
        // given
        int n = 16;

        int compareResult = 987;

        _12945 object = new _12945();

        // when
        int result = object.solution(n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}