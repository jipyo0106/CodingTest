package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _1170Test {
    @Test
    void testCase1() {
        // given
        String[] queries = {"cbd"};
        String[] word = {"zaaaz"};

        int[] compareResult = {1};

        _1170 object = new _1170();

        // when
        int[] result = object.solution(queries, word);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void testCase2() {
        // given
        String[] queries = {"bbb", "cc"};
        String[] word = {"a" , "aa", "aaa", "aaaa"};

        int[] compareResult = {1, 2};

        _1170 object = new _1170();

        // when
        int[] result = object.solution(queries, word);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

}