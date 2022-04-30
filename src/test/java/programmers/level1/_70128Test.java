package programmers.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _70128Test {
    @Test
    public void testCase1() {
        // given
        int a[] = {1, 2, 3, 4};
        int b[] = {-3, -1, 0, 2};
        int compareResult = 3;

        _70128 object = new _70128();

        // when
        int result = object.solution(a, b);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    public void testCase2() {
        // given
        int a[] = {-1, 0, 1};
        int b[] = {1, 0, -1};
        int compareResult = -2;

        _70128 object = new _70128();

        // when
        int result = object.solution(a, b);
        
        // then
        assertThat(result).isEqualTo(compareResult);
    }
}