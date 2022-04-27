package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12931Test {
    @Test
    public void testCase1() {
        // given
        int num = 123;
        // when
        _12931 object = new _12931();
        object.solution(num);
        // then
        assertThat(object.solution(num)).isEqualTo(6);
    }
    @Test
    public void testCase2() {
        // given
        int num = 987;
        // when
        _12931 object = new _12931();
        object.solution(num);
        // then
        assertThat(object.solution(num)).isEqualTo(24);
    }

}