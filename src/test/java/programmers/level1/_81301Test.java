package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _81301Test {
    @Test
    public void testCase1() {
        // given
        String s = "one4seveneight";
        int compareResult = 1478;
        _81301 object = new _81301();

        // when
        int result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    public void testCase2() {
        // given
        String s = "23four5six7";
        int compareResult = 234567;

        _81301 object = new _81301();
        // when
        int result = object.solution(s);
        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    public void testCase3() {
        // given
        String s = "2three45sixseven";
        int compareResult = 234567;

        _81301 object = new _81301();
        // when
        int result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    public void testCase4() {
        // given
        String s = "123";
        int compareResult = 123;
        _81301 object = new _81301();

        // when
        int result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

}