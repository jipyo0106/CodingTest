package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12915Test {
    @Test
    void testCase1() {
        // given
        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        String[] compareResult = {"car", "bed", "sun"};
        _12915 object = new _12915();

        // when
        String[] result = object.solution(strings, n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;

        String[] compareResult = {"abcd", "abce", "cdx"};
        _12915 object = new _12915();

        // when
        String[] result = object.solution(strings, n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase3() {
        // given
        String[] strings = {"bed", "car", "sun"};
        int n = 1;

        String[] compareResult = {"car", "bed", "sun"};
        _12915 object = new _12915();

        // when
        String[] result = object.solution(strings, n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}