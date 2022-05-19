package programmers.level2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12973Test {
    @Test
    void testCase1() {
        // given
        String s = "baabaa";

        int compareResult = 1;

        _12973 object = new _12973();

        // when
        int result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        String s = "cdcd";

        int compareResult = 0;

        _12973 object = new _12973();

        // when
        int result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

}