package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _87389Test {

    @Test
    void testCase1() {
        // given
        int n = 10;
        // when
        _87389 object = new _87389();
        // then
        assertThat(object.solution(n)).isEqualTo(3);
    }

    @Test
    void testCase2() {
        // given
        int n = 12;
        // when
        _87389 object = new _87389();
        // then
        assertThat(object.solution(n)).isEqualTo(11);
    }
}