package programmers.level2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _12951Test {
    @Test
    void testCase1() {
        // given
        String s = "3people unFollowed me";

        String compareResult = "3people Unfollowed Me";

        _12951 object = new _12951();

        // when
        String result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        String s = "for the last week";

        String compareResult = "For The Last Week";

        _12951 object = new _12951();

        // when
        String result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void 단어_첫번째_대문자() {
        // given
        String s = "test  test Test";

        String compareResult = "Test  Test Test";

        _12951 object = new _12951();

        // when
        String result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void 공백_여러줄() {
        // given
        String s = "   Test Test test 2 3";

        String compareResult = "   Test Test Test 2 3";

        _12951 object = new _12951();

        // when
        String result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void 마지막_공백() {
        // given
        String s = "  last empty 8numbers      ";

        String compareResult = "  Last Empty 8numbers      ";

        _12951 object = new _12951();

        // when
        String result = object.solution(s);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    

}