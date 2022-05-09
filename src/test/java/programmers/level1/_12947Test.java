package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12947Test {
    @Test
    void testCase1() {
        // given
        int arr = 10;
        boolean compareResult = true;

        _12947 object = new _12947();

        // when
        boolean result = object.solution(arr);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        int arr = 12;
        boolean compareResult = true;

        _12947 object = new _12947();

        // when
        boolean result = object.solution(arr);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase3() {
        // given
        int arr = 11;
        boolean compareResult = false;

        _12947 object = new _12947();

        // when
        boolean result = object.solution(arr);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase4() {
        // given
        int arr = 13;
        boolean compareResult = false;

        _12947 object = new _12947();

        // when
        boolean result = object.solution(arr);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}