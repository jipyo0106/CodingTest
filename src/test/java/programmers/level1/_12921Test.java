package programmers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12921Test {
    @Test
    void testCase1() {
        // given
        int n = 10;

        int compareResult = 4;

        _12921 object = new _12921();

        // when
        int result = object.solution(n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        int n = 5;

        int compareResult = 3;

        _12921 object = new _12921();

        // when
        int result = object.solution(n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    @DisplayName("100 소수")
    void testCase3() {
        // given
        int n = 100;

        int compareResult = 25;

        _12921 object = new _12921();

        // when
        int result = object.solution(n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    @DisplayName("1000 소수")
    void testCase4() {
        // given
        int n = 1000;

        int compareResult = 168;

        _12921 object = new _12921();

        // when
        int result = object.solution(n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}