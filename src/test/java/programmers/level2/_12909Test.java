package programmers.level2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _12909Test {
    @Test
    void testCase1() {
        // given
        String s = "()()";
        boolean compareResult = true;

        _12909 object = new _12909();

        // when
        boolean result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        String s = "(())()";
        boolean compareResult = true;

        _12909 object = new _12909();

        // when
        boolean result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase3() {
        // given
        String s = ")()(";
        boolean compareResult = false;

        _12909 object = new _12909();

        // when
        boolean result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase4() {
        // given
        String s = "(()(";
        boolean compareResult = false;

        _12909 object = new _12909();

        // when
        boolean result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

}