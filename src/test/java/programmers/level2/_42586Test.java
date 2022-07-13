package programmers.level2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _42586Test {
    @Test
    void testCase1() {
        // given
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] compareResult = {2, 1};

        _42586 object = new _42586();

        // when
        int[] result = object.solution(progresses, speeds);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        int[] compareResult = {1, 3, 2};

        _42586 object = new _42586();

        // when
        int[] result = object.solution(progresses, speeds);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

}