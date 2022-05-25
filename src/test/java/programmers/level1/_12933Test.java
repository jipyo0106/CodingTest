package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12933Test {
    @Test
    void testCase1() {
        // given
        long n = 118372;

        long compareResult = 873211;

        _12933 object = new _12933();

        // when
        long result = object.solution(n);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

}