package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12937Test {
    @Test
    void testCase1() {
        // given
        int num = 3;

        String compareResult = "Odd";
        _12937 object = new _12937();

        // when
        String result = object.solution(num);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void testCase2() {
        // given
        int num = 4;

        String compareResult = "Even";
        _12937 object = new _12937();

        // when
        String result = object.solution(num);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}