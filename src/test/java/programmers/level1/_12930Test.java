package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12930Test {
    @Test
    void testCase1() {
        // given
        String s = "try hello world";

        String compareResult = "TrY HeLlO WoRlD";

        _12930 object = new _12930();

        // when
        String result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void 입력값에_대문자가_섞여있을때() {
        // given
        String s = "Test Print";

        String compareResult = "TeSt PrInT";

        _12930 object = new _12930();

        // when
        String result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void 입력값이_공백일경우() {
        // given
        String s = "          ";

        String compareResult = "          ";

        _12930 object = new _12930();

        // when
        String result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void 입력값이_좌우공백으로_쌓여있을때() {
        // given
        String s = "     a     ";

        String compareResult = "     A     ";

        _12930 object = new _12930();

        // when
        String result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    
}