package programmers.level2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12939Test {
    @Test
    void testCase1() {
        // given
        String s = "1 2 3 4";

        String compareResult = "1 4";

        _12939 object = new _12939();

        // when
        String result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        String s = "-1 -2 -3 -4";

        String compareResult = "-4 -1";

        _12939 object = new _12939();

        // when
        String result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase3() {
        // given
        String s = "-1 -1";

        String compareResult = "-1 -1";

        _12939 object = new _12939();

        // when
        String result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

}