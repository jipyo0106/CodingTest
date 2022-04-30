package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12931Test {
    @Test
    public void testCase1() {
        // given
        int num = 123;
        int compareResult = 6;

        _12931 object = new _12931();

        // when
        int result = object.solution(num);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    public void testCase2() {
        // given
        int num = 987;
        int compareResult = 24;

        _12931 object = new _12931();

        // when
        int result = object.solution(num);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

}