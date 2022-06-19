package programmers.level1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class _42862Test {
    @Test
    void testCase1() {
        // given
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve ={1, 3, 5};

        int compareResult = 5;

        _42862 object = new _42862();

        // when
        int result = object.solution(n, lost, reserve);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve ={3};

        int compareResult = 4;

        _42862 object = new _42862();

        // when
        int result = object.solution(n, lost, reserve);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase3() {
        // given
        int n = 3;
        int[] lost = {3};
        int[] reserve ={1};

        int compareResult = 2;

        _42862 object = new _42862();

        // when
        int result = object.solution(n, lost, reserve);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase4() {
        // given
        int n = 5;
        int[] lost = {1, 2, 4};
        int[] reserve ={2, 3, 4, 5};

        int compareResult = 4;

        _42862 object = new _42862();

        // when
        int result = object.solution(n, lost, reserve);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}