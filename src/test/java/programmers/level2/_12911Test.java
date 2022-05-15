package programmers.level2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12911Test {
    @Test
    void testCase1() {
        // given
        int n = 78;

        int compareResult = 83;

        _12911 object = new _12911();

        // when
        int result = object.solution(n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void testCase2() {
        // given
        int n = 15;

        int compareResult = 23;

        _12911 object = new _12911();

        // when
        int result = object.solution(n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}