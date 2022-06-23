package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _12940Test {
    /*
    * 최대공약수와 최소공배수
    * https://programmers.co.kr/learn/courses/30/lessons/12940
    * */
    @Test
    void testCase1() {
        // given
        int n = 3,
            m = 12;
        int[] compareResult = {3, 12};

        _12940 object = new _12940();

        // when
        int[] result = object.solution(n, m);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        int n = 2,
                m = 5;
        int[] compareResult = {1, 10};

        _12940 object = new _12940();

        // when
        int[] result = object.solution(n, m);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

}