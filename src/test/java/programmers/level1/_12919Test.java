package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12919Test {
    @Test
    void testCase1() {
        // given
        String[] seoul = {"Jane", "Kim"};
        String compareResult = "김서방은 1에 있다";

        _12919 object = new _12919();

        // when
        String result = object.solution(seoul);

        // then
        assertThat(result).isEqualTo(compareResult);
    }


}