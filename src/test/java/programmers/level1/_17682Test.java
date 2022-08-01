package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _17682Test {
    @Test
    void testCase1() {
        // given
        String  dartResult = "1S2D*3T";

        int compareResult = 37;

        _17682 object = new _17682();

        // when
        int result = object.solution(dartResult);

        // then
        assertThat(result).isEqualTo(compareResult);
    }


    @Test
    void testCase2() {
        // given
        String  dartResult = "1D2S#10S";

        int compareResult = 9;

        _17682 object = new _17682();

        // when
        int result = object.solution(dartResult);

        // then
        assertThat(result).isEqualTo(compareResult);
    }


    @Test
    void testCase3() {
        // given
        String  dartResult = "1D2S0T";

        int compareResult = 3;

        _17682 object = new _17682();

        // when
        int result = object.solution(dartResult);

        // then
        assertThat(result).isEqualTo(compareResult);
    }


    @Test
    void testCase4() {
        // given
        String  dartResult = "1S*2T*3S";

        int compareResult = 23;

        _17682 object = new _17682();

        // when
        int result = object.solution(dartResult);

        // then
        assertThat(result).isEqualTo(compareResult);
    }


    @Test
    void testCase5() {
        // given
        String  dartResult = "1D#2S*3S";

        int compareResult = 5;

        _17682 object = new _17682();

        // when
        int result = object.solution(dartResult);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase6() {
        // given
        String  dartResult = "1T2D3D#";

        int compareResult = -4;

        _17682 object = new _17682();

        // when
        int result = object.solution(dartResult);

        // then
        assertThat(result).isEqualTo(compareResult);
    }


    @Test
    void testCase7() {
        // given
        String  dartResult = "1D2S3T*";

        int compareResult = 59;

        _17682 object = new _17682();

        // when
        int result = object.solution(dartResult);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}