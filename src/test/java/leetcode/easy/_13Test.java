package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _13Test {
    @Test
    void testCase1() {
        // given
        String s = "III";

        int compareResult = 3;

        _13 object = new _13();

        // when
        int result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        String s = "LVIII";

        int compareResult = 58;

        _13 object = new _13();

        // when
        int result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase3() {
        // given
        String s = "MCMXCIV";

        int compareResult = 1994;

        _13 object = new _13();

        // when
        int result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}