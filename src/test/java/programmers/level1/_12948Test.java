package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12948Test {
    @Test
    void testCase1() {
        // given
        String phone_number = "01033334444";

        String compareResult = "*******4444";

        _12948 object = new _12948();

        // when
        String result = object.solution(phone_number);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        String phone_number = "027778888";

        String compareResult = "*****8888";

        _12948 object = new _12948();

        // when
        String result = object.solution(phone_number);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

}