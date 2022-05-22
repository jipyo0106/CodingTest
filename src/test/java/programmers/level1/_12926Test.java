package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12926Test {
    @Test
    void testCase1() {
        // given
        String s = "AB";
        int n = 1;

        String compareResult = "BC";

        _12926 object = new _12926();

        // when
        String result = object.solution(s, n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void testCase2() {
        // given
        String s = "z";
        int n = 1;

        String compareResult = "a";

        _12926 object = new _12926();

        // when
        String result = object.solution(s, n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void testCase3() {
        // given
        String s = "a B z";
        int n = 4;

        String compareResult = "e F d";

        _12926 object = new _12926();

        // when
        String result = object.solution(s, n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}