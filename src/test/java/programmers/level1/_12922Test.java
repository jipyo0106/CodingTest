package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12922Test {
    @Test
    void testCase1() {
        // given
        int n = 3;
        String compareResult = "수박수";

        _12922 object = new _12922();

        // when
        String result = object.solution(n);

        // then
        assertThat(result).isEqualTo(compareResult);

    }

    @Test
    void testCase2() {
        // given
        int n = 4;
        String compareResult = "수박수박";

        _12922 object = new _12922();

        // when
        String result = object.solution(n);

        // then
        assertThat(result).isEqualTo(compareResult);

    }
}