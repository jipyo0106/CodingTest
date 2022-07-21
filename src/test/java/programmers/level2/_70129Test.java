package programmers.level2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _70129Test {
    @Test
    void testCase1() {
        // given
        String s = "110010101001";
        int[] compareResult = {3, 8};

        _70129 object = new _70129();

        // when
        int[] result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        String s = "01110";
        int[] compareResult = {3, 3};

        _70129 object = new _70129();

        // when
        int[] result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase3() {
        // given
        String s = "1111111";
        int[] compareResult = {4, 1};

        _70129 object = new _70129();

        // when
        int[] result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}