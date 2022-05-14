package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12943Test {
    @Test
    void testCase1() {
        // given
        int arr = 6;

        int compareResult = 8;

        _12943 object = new _12943();

        // when
        int result = object.solution(arr);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void testCase2() {
        // given
        int arr = 16;

        int compareResult = 4;

        _12943 object = new _12943();

        // when
        int result = object.solution(arr);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void testCase3() {
        // given
        int arr = 626331;

        int compareResult = -1;

        _12943 object = new _12943();

        // when
        int result = object.solution(arr);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void 입력값_1() {
        // given
        int num = 1;

        int compareResult = 0;

        _12943 object = new _12943();

        // when
        int result = object.solution(num);

        // then
        assertThat(result).isEqualTo(compareResult);
        
    }

    @Test
    void int범위_오버() {
        // given
        int num = 3330367;

        int compareResult = 301;

        _12943 object = new _12943();

        // when
        int result = object.solution(num);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}