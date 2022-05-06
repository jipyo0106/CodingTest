package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12917Test {
    @Test
    void testCase1() {
        // given
        String s = "Zbcdefg";
        String compareResult = "gfedcbZ";

        _12917 object = new _12917();

        // when
        String result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

}