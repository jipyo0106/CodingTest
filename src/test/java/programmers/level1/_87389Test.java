package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _87389Test {

    @Test
    void testCase1() {
        // given
        int n = 10;
        int compareResult = 3;

        _87389 object = new _87389();

        // when
        int result = object.solution(n);
        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        int n = 12;
        int compareResult = 11;

        _87389 object = new _87389();

        // when
        int result = object.solution(n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}