package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _81301Test {
    @Test
    public void testCase1() {
        // given
        String s = "one4seveneight";

        // when
        _81301 object = new _81301();

        // then
        assertThat(object.solution(s)).isEqualTo(1478);
    }
    @Test
    public void testCase2() {
        // given
        String s = "23four5six7";

        // when
        _81301 object = new _81301();

        // then
        assertThat(object.solution(s)).isEqualTo(234567);
    }
    @Test
    public void testCase3() {
        // given
        String s = "2three45sixseven";

        // when
        _81301 object = new _81301();

        // then
        assertThat(object.solution(s)).isEqualTo(234567);
    }
    @Test
    public void testCase4() {
        // given
        String s = "123";

        // when
        _81301 object = new _81301();

        // then
        assertThat(object.solution(s)).isEqualTo(123);
    }

}