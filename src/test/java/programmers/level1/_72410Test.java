package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _72410Test {
    @Test
    void testCase1() {
        // given
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        String compareResult = "bat.y.abcdefghi";

        _72410 object = new _72410();

        // when
        String result = object.solution(new_id);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        String new_id = "z-+.^.";
        String compareResult = "z--";

        _72410 object = new _72410();

        // when
        String result = object.solution(new_id);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase3() {
        // given
        String new_id = "=.=";
        String compareResult = "aaa";

        _72410 object = new _72410();

        // when
        String result = object.solution(new_id);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase4() {
        // given
        String new_id = "123_.def";
        String compareResult = "123_.def";

        _72410 object = new _72410();

        // when
        String result = object.solution(new_id);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase5() {
        // given
        String new_id = "abcdefghijklmn.p";
        String compareResult = "abcdefghijklmn";

        _72410 object = new _72410();

        // when
        String result = object.solution(new_id);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}