package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _68935Test {
    @Test
    void testCase1() {
        // given
        int n = 45;
        int compareResult = 7;

        _68935 object = new _68935();

        // when
        int result = object.solution(n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        int n = 125;
        int compareResult = 229;

        _68935 object = new _68935();

        // when
        int result = object.solution(n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

}